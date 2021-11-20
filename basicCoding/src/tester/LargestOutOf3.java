package tester;

import java.util.Scanner;

public class LargestOutOf3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number ");
		int a = sc.nextInt();

		System.out.println("Enter Second Number ");
		int b = sc.nextInt();

		System.out.println("Enter third Number ");
		int c = sc.nextInt();

		// Approach 1
//		if (a > b && a > c) {
//			System.out.println(a + " is the largest number! ");
//		} else if (b > a && b > c) {
//			System.out.println(b + " is the largest number! ");
//		} else
//			System.out.println(c + " is the largest number!");
//		
		// Ternary operator
		int largest = a > b ? a : b;

		largest = c > largest ? c : largest;
		
		System.out.println(largest+" is the largest number!");
	}

}
