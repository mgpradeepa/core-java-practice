/**
 * 
 */
package in.mgp.atm.factory;

import in.mgp.atm.service.DetailedStatement;
import in.mgp.atm.service.MiniStatement;
import in.mgp.atm.service.StatementType;

/**
 * @author pradeep
 * 
 */
public class StatementFactory extends Factory implements Cloneable {

	private static volatile StatementFactory factoryInstance = null;

	private StatementFactory() {
	}

	public static StatementFactory getInstance() {
		if (factoryInstance == null) {
			factoryInstance = new StatementFactory();

			System.out.println("Only one object is created for factory"
					+ factoryInstance.getClass().getName());
		}
		return factoryInstance;
	}

	@Override
	public StatementType createStatements(String statementType) {
		if (statementType.equalsIgnoreCase("mini")) {
			return new MiniStatement();
		} else if (statementType.equalsIgnoreCase("detailed")) {

			return new DetailedStatement();
		}

		throw new IllegalArgumentException("Type does not exist");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
