package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("abc", 71);
		hashMap.put("def", 22);
		hashMap.put("ghi", 83);
		hashMap.put("jkl", 42);
		hashMap.put("mno", 52);
		
		Set<String> keySet = hashMap.keySet();
		System.out.println("keys: "+keySet);
		
		Collection<Integer> values = hashMap.values();
		System.out.println("values: "+values);
		
		for (String string : keySet) {
			System.out.println("keys: "+string + " " + "values: "+ hashMap.get(string));
		}
		
	}
}
