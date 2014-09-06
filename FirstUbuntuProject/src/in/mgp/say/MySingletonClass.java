/**
 * 
 */
package in.mgp.say;

/**
 * @author pradeep
 *
 */
public class MySingletonClass {

	/**
	 * @param args
	 */
	private MySingletonClass() {
		
	}
	private static MySingletonClass mySingletonClass = null;
	
	public static MySingletonClass createInstance() {
		if (mySingletonClass == null)
		{
			mySingletonClass = new MySingletonClass();
		}
		return  mySingletonClass;
	}
}
