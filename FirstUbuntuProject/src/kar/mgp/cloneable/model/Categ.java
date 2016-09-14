package kar.mgp.cloneable.model;

import java.util.List;

public class Categ {
	private String name;
	private List<Attr> attrs;
	private List<Prod> prods;
	private List<Categ> categs;

	public List<Categ> getCategs() {
		return categs;
	}

	public void setCategs(List<Categ> categs) {
		this.categs = categs;
	}

	public Categ() {
		// TODO Auto-generated constructor stub
	}

	public Categ(String name, List<Attr> attrs, List<Prod> prods,
			List<Categ> categs) {
		super();
		this.name = name;
		this.attrs = attrs;
		this.prods = prods;
		this.categs = categs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Attr> getAttrs() {
		return attrs;
	}

	public void setAttrs(List<Attr> attrs) {
		this.attrs = attrs;
	}

	public List<Prod> getProds() {
		return prods;
	}

	public void setProds(List<Prod> prods) {
		this.prods = prods;
	}

	@Override
	public String toString() {
		return "Categ [name=" + name + ", attrs=" + attrs + ", prods=" + prods
				+ "]";
	}

}
