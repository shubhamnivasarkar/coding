package string;

import java.util.Scanner;

public class RemAllWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String x;
		System.out.println("enter a string");
		x=sc.nextLine();
		x=x.replaceAll("\\s", "");
		System.out.println(x);
	}

}
