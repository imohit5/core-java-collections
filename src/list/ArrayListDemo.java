package list;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// If initial capacity is not specified to ArrayList() then,
		// Before Java 8, the default capacity of ArrayList was 10 and increments of
		// 1.5x.
		// In java 8 default capacity of ArrayList is 0 until we add at least one
		// element into the ArrayList object.
		// If we add one element then capcity will become 10 and if size reaches 10 then
		// ArrayList will be copied to new ArrayList with capacity increased in terms of 1.5x.

		ArrayList arrayList = new ArrayList();
		displayDetails(arrayList);
		arrayList.add(1);
		displayDetails(arrayList);
		arrayList.add(new Integer(2));
		arrayList.add("3hello");
		arrayList.add(4.34);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		arrayList.add(10);
		displayDetails(arrayList);
		arrayList.add(11.34);
		displayDetails(arrayList);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);
		displayDetails(arrayList);
		arrayList.add(16);
		displayDetails(arrayList);
		
		//In this case initial capacity will be 10.
		ArrayList arrayList2 = new ArrayList(10);
		displayDetails(arrayList2);

	}

	private static void displayDetails(ArrayList arrayList) throws NoSuchFieldException, IllegalAccessException {
		System.out.println("------entered method------");
		System.out.println("hashcode: " + arrayList.hashCode());
		System.out.println("size: " + arrayList.size());
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		int capacity = ((Object[]) dataField.get(arrayList)).length;
		System.out.println("Capacity: " + capacity);
		System.out.println("------exiting method------");

	}

}
