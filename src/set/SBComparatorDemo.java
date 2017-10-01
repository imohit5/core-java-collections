package set;

import java.util.Comparator;

public class SBComparatorDemo implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String string1 = o1.toString();
		String string2 = o2.toString();
		return string1.compareTo(string2);
	}

}
