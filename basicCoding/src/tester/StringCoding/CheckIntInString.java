package string;

import java.util.Scanner;

public class CheckIntInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
String x;
System.out.println("enter a string ");
x=s.nextLine();
char y[]=x.toCharArray();
int size=y.length;

int i=0;
while(i!=size){
	if(y[i]>='0'&&y[i]<='9') {
		i++;
	}else {
		System.out.println("no int string");
		System.exit(0);
	}
}
System.out.println("it is in string");
	}

}
