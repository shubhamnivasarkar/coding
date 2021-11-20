package tester;

import java.util.*;

public class VectorImpl {

	public static void main(String[] args) {
		int n = 10;
		// declaring the vector with initial size n
		Vector<Integer> v = new Vector<Integer>(n);
		// appending elements at the end of the vector
		for (int i = 1; i <= n; i++) {
			v.add(i);

		}
		System.out.println(v);
		v.remove(9);
		System.out.println(v);
		v.remove(8);
		System.out.println(v);
		v.remove(7);
		System.out.println(v);
		v.remove(6);
		System.out.println(v);
		v.remove(5);
		System.out.println(v);
		v.remove(4);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
	}

}
