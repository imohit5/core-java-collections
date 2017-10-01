package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStringDemo {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet<String>();

		treeSet.add("abc");
		treeSet.add("mno");
		treeSet.add("pqr");
		treeSet.add("xyz");

		System.out.println("treeSet: " + treeSet);

		for (String string : treeSet) {
			System.out.println("treeSet: " + string);
		}

	}

}
