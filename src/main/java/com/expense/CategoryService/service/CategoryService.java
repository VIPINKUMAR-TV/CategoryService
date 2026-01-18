package com.expense.CategoryService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.expense.CategoryService.DTO.CategoryDTO;
import com.expense.CategoryService.mapper.CategoryMapper;
import com.expense.CategoryService.model.Category;
import com.expense.CategoryService.repository.CategoryRepository;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
	private final CategoryRepository repo;
	private final CategoryMapper mapper;
    private final HttpServletRequest request;

    private Long getCurrentUserId() {
        String userId = request.getHeader("X-User-Id");

        if (userId == null) {
            throw new RuntimeException("Missing X-User-Id header. API Gateway not forwarding userId.");
        }

        return Long.parseLong(userId);
    }
    
    public CategoryDTO createCategory(CategoryDTO dto) {
    	 Category entity = mapper.toEntity(dto);
    	 Long userId = getCurrentUserId();
    	 entity.setUserId(userId);
    	 Category saved = repo.save(entity);
         return mapper.toDto(saved);
    }
    
    public List<CategoryDTO> getAllForCurrentUser() {
    	
    	 Long userId = getCurrentUserId();
         //return repo.findByUserId(userId);
    	 return repo.findByUserId(userId)
                 .stream()
                 .map(mapper::toDto)
                 .toList();
    }

    public CategoryDTO getById(Long id) {
    	 Category category = repo.findById(id)
                 .orElseThrow(() -> new RuntimeException("Category not found with id " + id));
         return mapper.toDto(category);
    }

//    public CategoryDTO create(CategoryDTO dto) {
//        Category category = mapToEntity(dto);
//        return mapToDTO(repo.save(category));
//    }
    

}
