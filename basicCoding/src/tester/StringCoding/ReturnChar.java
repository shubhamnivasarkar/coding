package pattern;

import java.util.Scanner;

public class ReturnChar {
static char rchar(int num) {
	
	char w=(char)num;
	return w;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner dc=new Scanner(System.in);
System.out.println("enter a number");
int num=dc.nextInt();
for(int i=0;i<=5;i++) {
	//ReturnChar.rchar(num);
	char r=ReturnChar.rchar(num);
	System.out.println(r);
}
	}

}
