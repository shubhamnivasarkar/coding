package string;

import java.util.Scanner;

public class CountVowelsAlphaSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String x;

System.out.println("enter a string");
x=sc.nextLine();
sc.close();
char y[]=x.toCharArray();
int size=y.length;
int vc=0;
int consC=0;
int sp=0;
int i=0;
while(i != size) {
	if((y[i]>='A'&&y[i]<='Z')||(y[i]>='a'&&y[i]<='z')) {
		if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U'||y[i]=='a'||y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
			++vc;
		}else {
			++consC;
		}
	}else {
		++sp;
	}
	i++;
}
System.out.println(y);
System.out.println(vc);
System.out.println(consC);
System.out.println(sp);
	}


}
