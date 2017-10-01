
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteratorDemo {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		
		
		
		List<Integer> linkedList = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			linkedList.add(i);
		}
			
		 ListIterator<Integer> listIterator = linkedList.listIterator();
		
		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
			System.out.println(integer);

		}
		System.out.println(linkedList);
		
		while (listIterator.hasPrevious()) {
			Integer integer = (Integer) listIterator.previous();
			System.out.println(integer);

		}
		System.out.println(linkedList);
		

	}

	

}
