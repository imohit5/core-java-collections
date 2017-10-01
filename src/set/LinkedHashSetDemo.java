package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Random random = new Random();

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();

		for (int i = 0; i < 10; i++) {

			int nextInt = random.nextInt(25);
			linkedHashSet.add(nextInt);
			System.out.println("nextInt: " + nextInt);
		}
		// added order is preserved
		System.out.println("linkedHashSet: " + linkedHashSet);

	}

}
