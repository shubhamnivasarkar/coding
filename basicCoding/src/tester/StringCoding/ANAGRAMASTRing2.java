package string;

import java.util.Arrays;
import java.util.Scanner;

public class ANAGRAMASTRing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		String x,y;
		System.out.println("enter a string ");
		x=s.nextLine();
		y=s.nextLine();
		x=x.replace(" ", "");
		y=y.replace(" ", "");
		x=x.toLowerCase();
		y=y.toLowerCase();
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean res=Arrays.equals(a, b);
		if(res==true) {
			System.out.println("anagram");
		}else {
			System.out.println(" not anagram");
		}
	}

}
