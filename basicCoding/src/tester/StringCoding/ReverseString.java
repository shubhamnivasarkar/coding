package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
String x;
System.out.println("enter a string ");
x=s.nextLine();
char y[]=x.toCharArray();
int size=y.length;
char a[]= new char[size];
int i=0;
while(i!=size){
	a[size-1-i]=y[i];
	i++;
}
System.out.println(y);
System.out.println(a);
	}

}
