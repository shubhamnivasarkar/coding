package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RemDuplicateCharInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String x;
		System.out.println("enter a string");
		x=sc.nextLine();
		char y[]=x.toCharArray();
		int size=y.length;
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		int i=0;
		while(i!=size) {
			if((map.containsKey(y[i]))==false) {
				map.put(y[i], 1);
			}else {
				int oldval=map.get(y[i]);
				int nwval=oldval+1;
				map.put(y[i], nwval);
			}
			i++; 
		}
		for(Map.Entry<Character, Integer> a:map.entrySet()) {
			if(a.getValue()>1) {
				System.out.println(a.getKey());
				System.out.println(a.getValue());
			}else {
				
				System.exit(3);
			}
		}
	}

}
