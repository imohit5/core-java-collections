package list;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		
		
		Object objects[] = new Object[1000000];
		
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}

//		LinkedList<Object> linkedList = new LinkedList<Object>();
		
		List<Object> linkedList = new LinkedList<Object>();
		
		for (Object object : objects) {
			linkedList.add(object);
		}
		
		
		
		

	}

	

}
