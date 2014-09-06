package kar.mgp.generics.examples;


public class GenericWithTwoParameters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericWithTwoParameters genericWithTwoParameters = new GenericWithTwoParameters();
		Cache<String, Long> cacheVal = genericWithTwoParameters.new Cache<String, Long>(
				"Love the fate", 4L);
		cacheVal.printTypes();
	}

	class Cache<U, V> {
		private U key;
		private V value;

		public Cache() {
			// TODO Auto-generated constructor stub
		}

		public Cache(U key, V value) {
			super();
			this.key = key;
			this.value = value;
		}

		public void printTypes() {
			System.out.println("U --> "
					+ this.key.getClass().getCanonicalName());
			System.out
					.println("V --> " + this.value.getClass().getSimpleName());
		}
	}

}
