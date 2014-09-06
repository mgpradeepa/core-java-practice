/**
 * 
 */
package kar.mgp.threads;

/**
 * @author pradeep
 * 
 */
public class SuperDaemonThread {

	static boolean runnnnn = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Hanger hanger = new Hanger();

		// small operation
		hanger.chikOperation();
		new Thread(new Runnable() {

			@Override
			public void run() {
				runnnnn = true;
				System.out.println("Inisde run method");
				hanger.getMeRunAsynchronously("abrakadabrajigijigijumma");
			}
		}).start();
		if (runnnnn == true) {
			System.out.println("shuru agide");
		}
		hanger.takeMe();
		System.out.println("Running threads completed");
	}

}
