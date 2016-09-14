package kar.mgp.model;

import java.util.List;

public class SubCategoryLevel2 {
	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "SubCategoryLevel2 [products=" + products + "]";
	}

}
