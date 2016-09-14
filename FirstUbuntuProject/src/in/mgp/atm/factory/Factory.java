/**
 * 
 */
package in.mgp.atm.factory;

import in.mgp.atm.service.StatementType;

/**
 * @author pradeep
 * 
 */
public abstract class Factory {

	public abstract StatementType createStatements(String statementType);
}
