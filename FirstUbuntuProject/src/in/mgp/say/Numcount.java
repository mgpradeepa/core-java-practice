package in.mgp.say;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Numcount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	 int [] a  = {1,1,2,4,3,3,4,5,6,3};
	 Map<Integer, Integer> counterMap = new HashMap<Integer, Integer>() ;
	 Map< Integer, String> outputMap = new HashMap<Integer, String>() ;
	 
	 for(int i = 0 ; i < a.length ; i++) {
		 if(counterMap.get(a[i]) == null) {
			 counterMap.put(a[i], 1);
		 }
		 else {
			 counterMap.put(a[i], counterMap.get(a[i])+1);
		 }
//		 System.out.println(counterMap);
	 }
	 
	 for( Map.Entry<Integer, Integer> entry : counterMap.entrySet()) {
		 if(entry.getValue() % 2 == 0) {
			 outputMap.put(entry.getKey(),"Even" );
			 
			 System.out.println(" Eveen " + entry.getKey());
		 }
		 else {
			 outputMap.put(entry.getKey(), "Odd");
			 System.out.println(" Odd " + entry.getKey());
		 }
	 }
	 
//	 System.out.println(outputMap);
	 
	 
	}

}
