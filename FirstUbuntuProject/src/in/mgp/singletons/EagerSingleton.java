package in.mgp.singletons;

public class EagerSingleton {
	// this is done when needed on system startup scenarios

	private static volatile EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {

	}

	public EagerSingleton getInstance() {
		return eagerSingleton;
	}
}
