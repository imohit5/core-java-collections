package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer(10);

		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(integer1, "abc");
		hashMap.put(integer2, "abc");
		System.out.println("hashMap: " + hashMap);

		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(integer1, "abc");
		linkedHashMap.put(integer2, "abc");
		System.out.println("linkedHashMap: " + linkedHashMap);

		Map<Integer, String> identityHashMap = new IdentityHashMap<>();
		identityHashMap.put(integer1, "abc");
		identityHashMap.put(integer2, "abc");
		System.out.println("identityHashMap: " + identityHashMap);

	}
}
