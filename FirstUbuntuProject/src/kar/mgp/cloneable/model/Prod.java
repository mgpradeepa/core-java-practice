package kar.mgp.cloneable.model;

public class Prod {

	private String productcode;
	private String productId;
	private String webId;

	public Prod() {
		// TODO Auto-generated constructor stub
	}
	
	public Prod(String productcode, String productId, String webId) {
		super();
		this.productcode = productcode;
		this.productId = productId;
		this.webId = webId;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getWebId() {
		return webId;
	}

	public void setWebId(String webId) {
		this.webId = webId;
	}

	@Override
	public String toString() {
		return "Prod [productcode=" + productcode + ", productId=" + productId
				+ ", webId=" + webId + "]";
	}

}
