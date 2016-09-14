/**
 * 
 */
package kar.mgp.model;

import java.util.List;

/**
 * @author pradeep
 * 
 */
public class SubCategory {
	private String subCategoryId;
	private String subCategoryName;
	private List<SubCategoryLevel2> subCategoryLevel2s;

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<SubCategoryLevel2> getSubCategoryLevel2s() {
		return subCategoryLevel2s;
	}

	public void setSubCategoryLevel2s(List<SubCategoryLevel2> subCategoryLevel2s) {
		this.subCategoryLevel2s = subCategoryLevel2s;
	}

	@Override
	public String toString() {
		return "SubCategory [subCategoryId=" + subCategoryId
				+ ", subCategoryName=" + subCategoryName
				+ ", subCategoryLevel2s=" + subCategoryLevel2s + "]";
	}

}
