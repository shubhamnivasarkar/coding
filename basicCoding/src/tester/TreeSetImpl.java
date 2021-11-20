package tester;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Prateek");
		set.add("More");
		set.add("2021");
		System.out.println("---------------------------Using iterator---------------------------");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------System.out.println()---------------------------");
		System.out.println(set);
		set.remove("2021");
		System.out.println(set);

	}

}
