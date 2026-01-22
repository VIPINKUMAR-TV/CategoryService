package com.expense.CategoryService.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories", schema = "categorydb")
public class Category {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long catId;
	  
	  	private Long userId;
	    private String catName;
	    private String catStatus;
}
