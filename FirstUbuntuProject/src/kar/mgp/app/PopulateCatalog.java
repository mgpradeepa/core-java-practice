/**
 * 
 */
package kar.mgp.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kar.mgp.model.Catalog;
import kar.mgp.model.Category;
import kar.mgp.model.CategoryPath;
import kar.mgp.model.Dimension;

/**
 * @author pradeep
 * 
 */
public class PopulateCatalog {
	public static final String key1 = "k1";
	public static final String value1 = "v1";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		List<Category> categoryList = new ArrayList<Category>();
		List<CategoryPath> categoryPaths = new ArrayList<CategoryPath>();
		Category catagories = new Category();
		CategoryPath categoryPaths1 = new CategoryPath();
		categoryPaths1.setCategoryPathId("catepathid");
		categoryPaths1.setCategoryPathUrl(Arrays.asList("blue,red".split(",")));

		CategoryPath categoryPaths2 = new CategoryPath();
		categoryPaths2.setCategoryPathId("catepathid2");
		categoryPaths2.setCategoryPathUrl(Arrays.asList("blu111e,re1d"
				.split(",")));
		categoryPaths.add(categoryPaths1);
		categoryPaths.add(categoryPaths2);

		catagories.setCategoryId(key1);
		catagories.setCategoryName(value1);
		catagories.setCategoryPaths(categoryPaths);
		categoryList.add(catagories);
		catalog.setCatalogId(key1);

		catalog.setCatagories(categoryList);

		System.out.println("Catalog " + catalog);
		PopulateCatalog populateCatalog = new PopulateCatalog();
		populateCatalog.iterateCatalogMap(categoryList);
		
//		Dimension dimensionOriginal = catagories.c
		Category orig = new Category();
		
	}

	public void iterateCatalogMap(List<Category> categories) {
		// for(Catalog cat: catalog) {
		//
		// }
		
		Category c = new Category();
	}
}
