package com.expense.CategoryService.mapper;

import org.springframework.stereotype.Component;

import com.expense.CategoryService.DTO.CategoryDTO;
import com.expense.CategoryService.model.Category;

@Component
public class CategoryMapper {
	public CategoryDTO toDto(Category entity) {
        if (entity == null) return null;

        CategoryDTO dto = new CategoryDTO();
        dto.setCatId(entity.getCatId());
        dto.setCatName(entity.getCatName());
        dto.setCatStatus(entity.getCatStatus());
        return dto;
    }

    public Category toEntity(CategoryDTO dto) {
        if (dto == null) return null;

        Category entity = new Category();
        entity.setCatId(dto.getCatId());
        entity.setCatName(dto.getCatName());
        entity.setCatStatus(dto.getCatStatus());
        return entity;
    }
}
