package kar.mgp.model;

public class ProductAttributes {
	private String color;
	private String refinements;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRefinements() {
		return refinements;
	}

	public void setRefinements(String refinements) {
		this.refinements = refinements;
	}

	@Override
	public String toString() {
		return "ProductAttributes [color=" + color + ", refinements="
				+ refinements + "]";
	}

}
