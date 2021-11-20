package string;

import java.util.Scanner;

public class HowToProveStringAreImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String x;
		System.out.println("enter a string");
		x=sc.nextLine();
		sc.close();
		int l=x.length();
		if(l==0) {
			System.out.println("empty");
		}else {
			System.out.println("not empty");
		}
		
	}

}

