/**
 * 
 */
package kar.mgp.model;

import java.util.List;

/**
 * @author pradeep
 * 
 */
public class Catalog {
	private String catalogId;
	private List<Category> catagories;

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public List<Category> getCatagories() {
		return catagories;
	}

	public void setCatagories(List<Category> catagories) {
		this.catagories = catagories;
	}

	@Override
	public String toString() {
		return "Catalog [catalogId=" + catalogId + ", catagories=" + catagories
				+ "]";
	}

}
