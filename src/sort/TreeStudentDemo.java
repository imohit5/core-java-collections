package sort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeStudentDemo {

	public static void main(String[] args) {

		Set<Student> treeSet = new TreeSet<Student>();

		treeSet.add(new Student(1, "tim"));
		treeSet.add(new Student(22, "tom"));
		treeSet.add(new Student(15, "tong"));
		treeSet.add(new Student(3, "tons"));

		System.out.println("treeSet: " + treeSet);

		for (Student student : treeSet) {
			System.out.println("id: " + student.id);
			System.out.println("name: " + student.name);
		}

	}

}
