
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {


		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			arrayList.add(i+1);
		}
		
		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			iterator.remove();

		}

		System.out.println(arrayList);
		

	}

	

}
