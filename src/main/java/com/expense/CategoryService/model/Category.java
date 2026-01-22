package com.expense.CategoryService.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
	@SequenceGenerator(
	    name = "cat_seq",
	    sequenceName = "categorydb.category_seq",
	    allocationSize = 1
	)
	@Column(name = "cat_id")
	    private Long catId;
	  
	  	private Long userId;
	    private String catName;
	    private String catStatus;
}
