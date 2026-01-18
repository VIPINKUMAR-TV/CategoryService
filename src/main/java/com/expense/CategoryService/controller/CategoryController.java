package com.expense.CategoryService.controller;

import java.util.List;

//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense.CategoryService.DTO.CategoryDTO;
import com.expense.CategoryService.model.Category;
import com.expense.CategoryService.repository.CategoryRepository;
import com.expense.CategoryService.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
    	return service.getAllForCurrentUser();
    }
    
    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO catDTO) {
        return service.createCategory(catDTO);
    }
    
    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    
//    @GetMapping("/me")
//    public String getCurrentUser() {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        return "Current user: " + auth.getName();
//    }

}
