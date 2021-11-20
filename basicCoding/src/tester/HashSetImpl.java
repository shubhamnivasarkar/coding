package tester;

import java.util.*;

public class HashSetImpl {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet();
		// hashSet does not allow duplicate elements
		set.add("prateek");
		set.add("prateek");
		set.add("More");
		set.add("2020");
		set.add("engineer");
		set.add("developer");
		// displaying using iterator
		//
		System.out.println("---------------------------displaying using iterator---------------------------");
		Iterator i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------using println---------------------------");
		System.out.println(set);
		set.remove("engineer");
		System.out.println(set.contains("prateek"));
		System.out.println(set);
//		System.out.println("removing prateek from the list:- ");
		set.remove("prateek");
		System.out.println(set);
		set.remove("More");
		System.out.println(set);
		set.remove("developer");
		System.out.println(set);
		set.remove("2020");
		System.out.println(set);
		set.remove("engineer");
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);

	}

}
