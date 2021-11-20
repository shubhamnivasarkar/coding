package tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCollection {

	public static void main(String[] args) {
		String ss = "Prateek";
		char a[] = ss.toCharArray();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		List<String> list = new ArrayList<String>();
		list.add("Prateek");
		list.add("Anuja");
//		System.out.println(list);
		System.out.println("Using forEach lambda");
		list.forEach(ele -> {
			System.out.print(ele+",");
		});
//		for (String s : list) {
//			System.out.print(s + ",");
//		}
		System.out.println();
		HashSet<String> set = new HashSet<String>(list);
//		System.out.println(set);
		for (String s : set) {
			System.out.print(s + ",");
		}
	}

}
