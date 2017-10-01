package otherutilarrays;

import java.util.Arrays;

public class ArrayBSTDemo {

	public static void main(String[] args) {

		String[] arr = { "A", "D", "Z", "P", "O" };

		System.out.println("Before Sort");
		for (String i : arr) {
			System.out.println(i);
		}

		Arrays.sort(arr);

		System.out.println("After Sort");
		for (String i : arr) {
			System.out.println(i);
		}

		// int binarySearch = Arrays.binarySearch(arr, "D");
		int binarySearch = Arrays.binarySearch(arr, "E");

		System.out.println("After BST");
		System.out.println(binarySearch);

	}

}
