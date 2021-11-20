package string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		String x;
		System.out.println("enter a string ");
		x=s.nextLine();
		x=x.replace(" ","");
		x=x.toLowerCase();
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]= new char[size];
		int i=0;
		while(i!=size){
			a[size-1-i]=y[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(y[i]!=a[i]) {
				System.out.println("not panlindrome");
				System.exit(0);
			}else {
				++i;
				continue;
			}
		}
		System.out.println("palindrome");
	}

}
