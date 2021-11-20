package tester;

import java.util.*;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		System.out.println("---------------------------Using Iterator---------------------------");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------Using System.out.println---------------------------");
		System.out.println(set);
	}

}
