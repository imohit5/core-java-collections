
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIteratorDemo {

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

		Iterator<Integer> iterator = treeSet.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			iterator.remove();

		}

		System.out.println(treeSet);

	}

}
