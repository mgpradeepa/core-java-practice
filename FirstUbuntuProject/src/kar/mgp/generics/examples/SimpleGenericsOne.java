package kar.mgp.generics.examples;


public class SimpleGenericsOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleGenericsOne genericsOne = new SimpleGenericsOne();
		FirstGenerics<String> fg = genericsOne.new  FirstGenerics<String>("dfadf");
		fg.getObjRef();
		fg.printType();
		FirstGenerics<Boolean> booleanFg = genericsOne.new FirstGenerics<Boolean>(Boolean.TRUE);
		booleanFg.printType();
	}

	class FirstGenerics<T> {
		private T objRef = null;
 
		public FirstGenerics() {
			// TODO Auto-generated constructor stub
		}
		public FirstGenerics(T objRef) {
			this.objRef = objRef;
		}

		public T getObjRef() {
			return this.objRef;
		}
		public void printType() {
			System.out.println("Type : " + objRef.getClass().getSimpleName());
		}

	
	}

}
