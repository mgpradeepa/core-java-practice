package in.mgp.say;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapAata {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, String> aataMap = new HashMap<String, String>();
		aataMap.put("key1", "value1");
		aataMap.put("key2", "value2");
		aataMap.put("key3", "value3");
		aataMap.put("key4", "value4");
		aataMap.put("key5", "value5");
		aataMap.put("key6", "value6");
		aataMap.put("key7", "value7");
		aataMap.put("key8", "value8");
		aataMap.put("key9", "value9");
		aataMap.put("key10", "value10");

		Map<String, String> clonedMap =  (Map<String, String>) new HashMap<String, String>(aataMap).clone();
		aataMap.remove("key2");
		System.out.println("Map " + aataMap);
		System.out.println("Map-Set view " + aataMap.keySet());
		aataMap.putAll(clonedMap);
		 
		System.out.println("cloned map " + clonedMap);
		System.out.println("Collection<v> view" + clonedMap.values()); 
		
		
	}

}
