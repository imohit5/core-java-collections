package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStringBufferDemo {

	public static void main(String[] args) {
		Set<StringBuffer> treeSet = new TreeSet<StringBuffer>(new SBComparatorDemo());

		treeSet.add(new StringBuffer("abc"));
		treeSet.add(new StringBuffer("mno"));
		treeSet.add(new StringBuffer("pqr"));
		treeSet.add(new StringBuffer("xyz"));

		System.out.println("treeSet: " + treeSet);

		for (StringBuffer stringBuffer : treeSet) {
			System.out.println("treeSet: " + stringBuffer);
		}
	}

}
