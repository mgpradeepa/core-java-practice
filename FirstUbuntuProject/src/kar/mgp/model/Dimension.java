/**
 * 
 */
package kar.mgp.model;

import java.util.List;

/**
 * @author pradeep
 * 
 */
public class Dimension {
	private String dimensionId;
	private String dimensionName;
	private List<CategoryPath> dimensionPaths;
	private List<SubCategory> subCategories;

	public String getDimensionId() {
		return dimensionId;
	}

	public void setDimensionId(String dimensionId) {
		this.dimensionId = dimensionId;
	}

	public String getCategoryName() {
		return dimensionName;
	}

	public void setCategoryName(String dimensionName) {
		this.dimensionName = dimensionName;
	}

	public List<CategoryPath> getCategoryPaths() {
		return dimensionPaths;
	}

	public void setCategoryPaths(List<CategoryPath> dimensionPaths) {
		this.dimensionPaths = dimensionPaths;
	}

	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	@Override
	public String toString() {
		return "Dimension [dimensionId=" + dimensionId + ", dimensionName="
				+ dimensionName + ", dimensionPaths=" + dimensionPaths
				+ ", subCategories=" + subCategories + "]";
	}

}
