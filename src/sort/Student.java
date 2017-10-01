package sort;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		int id2 = this.id;
		int id3 = o.id;
		if (id2<id3) {
			return -1;
		} else if (id2>id3) {
			return 1;
		} else {
			return 0;
		}
		
	}

}
