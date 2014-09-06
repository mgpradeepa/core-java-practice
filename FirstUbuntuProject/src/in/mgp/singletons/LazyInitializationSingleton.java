package in.mgp.singletons;

/**
 * Lazy initialization
 * 
 * @author pradeep
 * 
 */
public final class LazyInitializationSingleton {

	private static LazyInitializationSingleton initializationSingleton = null;

	private LazyInitializationSingleton() {
	}

	public LazyInitializationSingleton getLazyInitializationSingletonInstance() {
		if (initializationSingleton == null) {
			synchronized (LazyInitializationSingleton.class) {
				initializationSingleton = new LazyInitializationSingleton();
			}
		}
		return initializationSingleton;
	}

}
