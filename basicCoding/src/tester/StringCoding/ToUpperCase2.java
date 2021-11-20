package string;

import java.util.Scanner;

public class ToUpperCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String x;

System.out.println("enter a string");
x=sc.nextLine();
sc.close();
char y[]=x.toCharArray();
int size=y.length;
y[0]=(char)(y[0]-32);
int i=0;
while(i != size) {
	if(y[i]==' ') {
	y[i+1]=(char)(y[i+1]-32);
	}
	++i;
}
System.out.println(y);
	}

}
