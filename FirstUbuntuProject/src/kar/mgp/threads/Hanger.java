package kar.mgp.threads;

public class Hanger {

	public void getMeRunAsynchronously(String str) {
		System.out.println(str.substring(5));

		for (int i = 0; i < 120000; i++)
			System.out.println("Random number --> " + Math.random() * i);
	}

	public String chikOperation() {
		System.out.println("Inside chikku operation");
		return Math.random() * 120 + "mag";
	}
	
	public void takeMe() {
	
		for(int i = 0; i < 5; i++ ){
			for(int j = 0; j < i; j++){
				System.out.println("*");
			}
		}
	}
	
}
