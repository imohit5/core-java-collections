package set;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int length1 = o1.length();
		int length2 = o2.length();

		if (length1 < length2) {
			return 1;
		} else if (length1 > length2) {
			return -1;
		} else {
			return o1.compareTo(o2);
		}

	}

}
