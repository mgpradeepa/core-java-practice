package in.mgp.singletons;

import java.io.Serializable;

public class AptSingleton implements Serializable, Cloneable {

	/**
	 * required when the class structure may change during serialization and
	 * de-serialization process.
	 */
	private static final long serialVersionUID = -3816261019467800096L;

	/**
	 * 
	 * private constructor making it not available for the external user to
	 * create an instance of it
	 */
	private AptSingleton() {
	}

	/**
	 * 
	 * using inner class --> better utilization of memory using Bill-Pugh
	 * solution
	 */
	private static class AptSingletonInstanceCreator {
		public static final AptSingleton INSTANCE = new AptSingleton();
	}

	/**
	 * creating one instance of the class {@link AptSingleton}
	 * 
	 */
	public static AptSingleton getInstance() {
		return AptSingletonInstanceCreator.INSTANCE;
	}

	/**
	 * helps in serialization and de-serialization consistency of the values.
	 */
	protected Object readResolve() {
		return getInstance();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	}

}
