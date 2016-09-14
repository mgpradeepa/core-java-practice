/**
 * 
 */
package in.mgp.atm.service;

/**
 * @author pradeep
 * 
 */
public class DetailedStatement implements StatementType {

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.mgp.atm.service.StatementType#print()
	 */
	@Override
	public String print() {

		System.out.println("Detailed statement");
		return "detailed";
	}

}
