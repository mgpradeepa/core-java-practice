package kar.mgp.cloneable.model;

import java.util.LinkedList;
import java.util.List;

public class Dimen implements Cloneable {
	private String name;
	private List<Attr> attrs;
	private List<Prod> prods;
	private List<Dimen> dimens;

	public List<Dimen> getDimens() {
		return dimens;
	}

	public void setDimens(List<Dimen> dimens) {
		this.dimens = dimens;
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

	public Dimen() {
		// TODO Auto-generated constructor stub
	}


	public Dimen(String name, List<Attr> attrs, List<Prod> prods,
			List<Dimen> dimens) {
		super();
		this.name = name;
		this.attrs = attrs;
		this.prods = prods;
		this.dimens = dimens;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List categories = new LinkedList<Categ>();
 		for (Dimen dimenIter : this.dimens) {
// 			categories.
 			
			
			
		}
		
		Categ categ = new Categ(this.name, this.attrs, this.prods, categories);

		return categ;
	}

	@Override
	public String toString() {
		return "Dimen [name=" + name + ", attrs=" + attrs + ", prods=" + prods
				+ ", dimens=" + dimens + "]";
	}

	
}
