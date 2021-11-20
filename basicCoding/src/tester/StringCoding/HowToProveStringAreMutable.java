package string;

import java.util.Scanner;

public class HowToProveStringAreMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc= new Scanner (System.in);
		StringBuffer x= new StringBuffer("mailo");
		StringBuffer y=new StringBuffer("satav");
		System.out.println("enter a string");
		x.append(y);
		System.out.println(x);
		
		
		
	}

}

