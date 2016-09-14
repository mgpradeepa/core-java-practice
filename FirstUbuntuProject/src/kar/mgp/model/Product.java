package kar.mgp.model;

import java.util.List;

public class Product {
	private String productCode;
	private String productName;
	private List<ProductAttributes> attributes;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<ProductAttributes> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ProductAttributes> attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName="
				+ productName + ", attributes=" + attributes + "]";
	}

}
