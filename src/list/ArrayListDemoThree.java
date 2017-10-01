package list;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemoThree {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// Display, Insert, Replace

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(i+1);
		}
		
		System.out.println(arrayList);
		
		arrayList.add(2, 200);
		
		System.out.println(arrayList);
		
		arrayList.add(5, 500);
		
		System.out.println(arrayList);
		
		
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		for (int i = 10; i < 20; i++) {
			arrayList2.add(i+1);
		}
		System.out.println(arrayList2);
		
		//list.addAll(arrayList2);
		
		arrayList.addAll(6,arrayList2);
		
		System.out.println(arrayList);
		

		if (arrayList.contains(500)) {
			System.out.println("contains");
		} else {
			System.out.println("does not contains");
		}
		
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		arrayList.remove(1);
		
		System.out.println(arrayList);
	}
	
	
	

	

}
