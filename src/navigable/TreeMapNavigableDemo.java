package navigable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapNavigableDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(10,"abc");
		treeMap.put(20,"def");
		treeMap.put(30,"ghi");
		treeMap.put(40,"jkl");
		treeMap.put(50,"mno");
		
		
		System.out.println("treeMap: " + treeMap);

		System.out.println("treeMap floor: " + treeMap.floorKey(20));
		System.out.println("treeMap lower: " + treeMap.lowerKey(20));
		System.out.println("treeMap ceiling: " + treeMap.ceilingKey(20));
		System.out.println("treeMap higher: " + treeMap.higherKey(20));
		System.out.println("treeMap pollFirst: " + treeMap.pollFirstEntry());
		System.out.println("treeMap pollLast: " + treeMap.pollLastEntry());
		System.out.println("treeMap descendingSet: " + treeMap.descendingMap());
		
		System.out.println("treeMap: " + treeMap);
		
	}
}
