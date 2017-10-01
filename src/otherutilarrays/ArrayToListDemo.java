package otherutilarrays;

import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo {

	public static void main(String[] args) {

		String[] arr = {"A", "D", "Z", "P", "O"};
		
		System.out.println("Before Sort");
		for (String i : arr) {
			System.out.println(i);
		}
		
		Arrays.sort(arr);
		
		System.out.println("After Sort");
		for (String i : arr) {
			System.out.println(i);
		}
		
		List<String> asList = Arrays.asList(arr);
		
		System.out.println(asList);
		//asList.add("X"); //UnsupportedOperationException
		arr[4]= "X";
		System.out.println(asList);
	}

}
