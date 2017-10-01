package set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {

	public static void main(String[] args) {

		Random random = new Random();

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(random.nextInt(5));
		}
		
		System.out.println("list: "+arrayList);
		
		HashSet<Integer> hashSet = new HashSet<Integer>(arrayList);
		System.out.println("set: "+hashSet);

	}

}
