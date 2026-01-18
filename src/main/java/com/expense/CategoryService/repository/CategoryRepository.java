package com.expense.CategoryService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expense.CategoryService.DTO.CategoryDTO;
import com.expense.CategoryService.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	List<Category> findByUserId(Long userId);
}
