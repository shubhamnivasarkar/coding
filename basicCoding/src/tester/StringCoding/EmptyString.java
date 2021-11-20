package string;

import java.util.Scanner;

public class EmptyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String x,y;
		System.out.println("enter a string");
		x=sc.nextLine();
		y=sc.nextLine();
		x.concat(y);
		
		sc.close();
		System.out.println(x);
		
		}
		
	

}

