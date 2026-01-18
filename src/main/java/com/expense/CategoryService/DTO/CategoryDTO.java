package com.expense.CategoryService.DTO;

public class CategoryDTO {

	 	private Long catId;
	    private String catName;
	    private String catStatus;
	    // getters & setters
		public Long getCatId() {
			return catId;
		}
		public void setCatId(Long catId) {
			this.catId = catId;
		}
		public String getCatName() {
			return catName;
		}
		public void setCatName(String catName) {
			this.catName = catName;
		}
		public String getCatStatus() {
			return catStatus;
		}
		public void setCatStatus(String catStatus) {
			this.catStatus = catStatus;
		}
	    
}
