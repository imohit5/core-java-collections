package navigable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNavigableDemo {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();

		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(50);

		System.out.println("treeSet: " + treeSet);

		System.out.println("treeSet floor: " + treeSet.floor(20));
		System.out.println("treeSet lower: " + treeSet.lower(20));
		System.out.println("treeSet ceiling: " + treeSet.ceiling(20));
		System.out.println("treeSet higher: " + treeSet.higher(20));
		System.out.println("treeSet pollFirst: " + treeSet.pollFirst());
		System.out.println("treeSet pollLast: " + treeSet.pollLast());
		System.out.println("treeSet descendingSet: " + treeSet.descendingSet());
		
		System.out.println("treeSet: " + treeSet);

	}

}
