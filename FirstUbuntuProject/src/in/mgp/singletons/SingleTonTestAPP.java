package in.mgp.singletons;

public class SingleTonTestAPP implements Cloneable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingleTonTestAPP app = new SingleTonTestAPP();
		EagerSingleton eagerSingleton = null;
		eagerSingleton.getInstance();

	}
}
