package tester;

import java.util.*;

public class ArrayListImplementation {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Prateek");
		l.add("Anuja");
		l.add("kabeer");
		System.out.println("List objects are " + l);
		l.remove("kabeer");
		System.out.println("After removing kabeer, List elements are " + l);
		System.out.println("List for integer data types:-");
		List<Integer> l1 = new ArrayList<>();
		l1.add(6);
		l1.add(6);
		l1.add(6);
//		System.out.println("Integer list is:- " + l1);
		l1.forEach(numbers -> {
			System.out.print(numbers);
		});

	}

}
