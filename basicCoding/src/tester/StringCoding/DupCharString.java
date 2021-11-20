package findduplicatecharinstring;

import java.util.Scanner;

public class DupCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String str;
         int count=0;
         System.out.println("enter a string");
         str=sc.next();
         System.out.println("duplicate char are");
         char[] chars=str.toCharArray();
         for(int i=0;i<str.length();i++) {
        	 for(int j=i+1;j<str.length();j++) {
        		 if(chars[i]==chars[j]) {
        			 System.out.println(chars[j]);
        			 count++;
        			 break;
        		 }
        		 
        	 }
         }
	}

}
