package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetDemoTwo {

	public static void main(String[] args) {

		Random random = new Random();

		// https://stackoverflow.com/questions/17401469/hashset-giving-the-output-in-ascending-order
		// Hashset doesn't guarantee the order of elements. But it calculates hashcode
		// for objects in it. You might be having it since integers might be giving a
		// sequential hashcode (until the capacity max is reached)
		// Hashset has an array of buckets. According to source code initial capacity is
		// 16:
		// static final int DEFAULT_INITIAL_CAPACITY = 16;
		// So when you try your small integers they got placed up in order
		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			
			// sorted for smaller values
			// int nextInt = random.nextInt(10);
			
			// not sorted for larger values
			int nextInt = random.nextInt(25);
			hashSet.add(nextInt);
			System.out.println("nextInt: " + nextInt);
		}

		System.out.println("hashSet: " + hashSet);

	}

}
