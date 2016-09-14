/**
 * 
 */
package kar.mgp.model;

import java.util.List;

/**
 * @author pradeep
 * 
 */
public class Category  implements Cloneable{
	private String categoryId;
	private String categoryName;
	private List<CategoryPath> categoryPaths;
	private List<SubCategory> subCategories;

	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(String categoryId, String categoryName,
			List<CategoryPath> categoryPaths, List<SubCategory> subCategories) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryPaths = categoryPaths;
		this.subCategories = subCategories;
	}
	


	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<CategoryPath> getCategoryPaths() {
		return categoryPaths;
	}

	public void setCategoryPaths(List<CategoryPath> categoryPaths) {
		this.categoryPaths = categoryPaths;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName="
				+ categoryName + ", categoryPaths=" + categoryPaths
				+ ", subCategories=" + subCategories + "]";
	}

}
