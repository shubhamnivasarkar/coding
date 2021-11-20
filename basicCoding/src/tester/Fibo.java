package tester;

import java.util.Scanner;

// fibonacci series
public class Fibo {

	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		int no;
		
		System.out.println("Input");
		Scanner scan = new Scanner(System.in);
		no = scan.nextInt();
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < no; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

}

//class FibonacciExample2{  
//	 static int n1=0,n2=1,n3=0;    
//	 static void printFibonacci(int count){    
//	    if(count>0){    
//	         n3 = n1 + n2;    
//	         n1 = n2;    
//	         n2 = n3;    
//	         System.out.print(" "+n3);   
//	         printFibonacci(count-1);    
//	     }    
//	 }    
//	 public static void main(String args[]){    
//	  int count=10;    
//	 System.out.print(n1+" "+n2);//printing 0 and 1    
//printFibonacci(count-2);//n
