package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Random random = new Random();

		 Set<Integer> treeSet = new TreeSet<Integer>();

		for (int i = 0; i < 10; i++) {

			int nextInt = random.nextInt(25);
			treeSet.add(nextInt);
			System.out.println("nextInt: " + nextInt);
		}
		// sorted values
		System.out.println("treeSet: " + treeSet);

	}

}
