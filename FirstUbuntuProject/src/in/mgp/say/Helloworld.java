/**
 * 
 */
package in.mgp.say;

/**
 * @author pradeep
 *
 */
public class Helloworld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

		MySingletonClass class1 = MySingletonClass.createInstance();

		System.out.println(class1.hashCode());		

	}

}
