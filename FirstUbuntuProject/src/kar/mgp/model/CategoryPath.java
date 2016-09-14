/**
 * 
 */
package kar.mgp.model;

import java.util.List;

/**
 * @author pradeep
 * 
 */
public class CategoryPath {
	private String categoryPathId;
	private List<String> categoryPathUrl;

	public String getCategoryPathId() {
		return categoryPathId;
	}

	public void setCategoryPathId(String categoryPathId) {
		this.categoryPathId = categoryPathId;
	}

	public List<String> getCategoryPathUrl() {
		return categoryPathUrl;
	}

	public void setCategoryPathUrl(List<String> categoryPathUrl) {
		this.categoryPathUrl = categoryPathUrl;
	}

	@Override
	public String toString() {
		return "CategoryPath [categoryPathId=" + categoryPathId
				+ ", categoryPathUrl=" + categoryPathUrl + "]";
	}

}
