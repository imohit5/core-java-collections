package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new LinkedHashMap<>();
		
		hashMap.put("abc", 1);
		hashMap.put("def", 2);
		hashMap.put("ghi", 3);
		hashMap.put("jkl", 4);
		hashMap.put("mno", 5);
		
		Set<String> keySet = hashMap.keySet();
		System.out.println("keys: "+keySet);
		
		Collection<Integer> values = hashMap.values();
		System.out.println("values: "+values);
		
		for (String string : keySet) {
			System.out.println("keys: "+string + " " + "values: "+ hashMap.get(string));
		}
		
	}
}
