package tester;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string!");
		String original = scan.next();
		String revOfOriginal = "";

		int len = original.length();

		for (int i = len - 1; i >= 0; i--) {
			revOfOriginal = revOfOriginal + original.charAt(i);
		}
		if (revOfOriginal.equals(original)) {
			System.out.println("String  is palindrome");
		} else
			System.out.println("String is not palindrome");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number!");
//		int num = sc.nextInt();
//		int org_num = num;
//
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		if(org_num==rev) {
//			System.out.println(org_num + "is a palindrome number");
//		}else
//			System.out.println(org_num + "is not a palindrome number");
	}

}
