package string;

import java.util.Scanner;

public class Panagam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		String x;
		System.out.println("enter a string ");
		x=s.nextLine();
		x=x.replace(" ", "");
	char y	[]=x.toCharArray();
	int size=y.length;
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int i=0;
	while(i!=size) {
		int index=y[i]-65;
		a[index]=1;
		i++;
	}
	 i=0;
	 while(i!=26) {
		 if(a[i]==1) {
			 i++;
		 }else {
			 System.out.println("not a panagram");
			 System.exit(2);
		 }
	 }
	
	}

}
