package otherutilcollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsBSTDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("A");
		al.add("D");
		al.add("Z");
		al.add("P");
		al.add("O");

		System.out.println(al);

		// int binarySearch = Collections.binarySearch(al, "D");
		int binarySearch = Collections.binarySearch(al, "E");

		System.out.println(binarySearch);

	}

}
