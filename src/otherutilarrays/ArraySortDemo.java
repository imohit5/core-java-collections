package otherutilarrays;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {

		int[] arr = {15, 6, 20, 50};
		
		System.out.println("Before Sort");
		for (int i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr);
		
		System.out.println("After Sort");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
