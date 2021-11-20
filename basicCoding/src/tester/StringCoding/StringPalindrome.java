package stringpalindrome;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
    String original,reve="";
    System.out.println("enter a original string");
    original=s.next();
    int length=original.length();
    for(int i=length-1;i>=0;i--) {
    	reve=reve+original.charAt(i);
    }
    System.out.println("reverse string is "+reve);
    if(original.equals(reve)) {
    	System.out.println("string is palindrome");
    	
    }else {
    	System.out.println("string is  not palindrome");
    }
	}

}
