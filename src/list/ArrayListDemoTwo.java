package list;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemoTwo {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// Restricting ArrayList type

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		
		arrayList.add(new Integer(2));
		//list.add("3hello"); error, cannot add
		//list.add(4.34); error, cannot add
		

	}

	

}
