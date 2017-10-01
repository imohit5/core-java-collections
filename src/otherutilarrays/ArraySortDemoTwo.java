package otherutilarrays;

import java.util.Arrays;

public class ArraySortDemoTwo {

	public static void main(String[] args) {

		String[] arr = {"A", "D", "Z", "P", "O"};
		
		System.out.println("Before Sort");
		for (String i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr, new ComparatorDemo());
		
		System.out.println("After Sort");
		for (String i : arr) {
			System.out.println(i);
		}
	}

}
