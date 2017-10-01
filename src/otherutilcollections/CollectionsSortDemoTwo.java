package otherutilcollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemoTwo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add("D");
		al.add("Z");
		al.add("P");
		al.add("O");
		
		System.out.println(al);
		
		Collections.sort(al, new ComparatorDemo());
		
		System.out.println(al);
		
	}

}
