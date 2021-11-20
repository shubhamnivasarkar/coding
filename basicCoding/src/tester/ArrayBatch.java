package tester;

import java.util.*;

public class ArrayBatch {
	public static void main(String[] args) {
		int array[] = new int[120];
		int num = 1;
		while (num <= 120) {
			for (int i = 0; i < array.length; i++) {
				array[i] = num;
				num++;
			}
		}

//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		int limit=40;
		int count = 0;
		int i=0;
		while(count<=(array.length)/40) {
			count=array[i+40];
		for (i = 0; i < count-1; i++) {
			System.out.print(array[i]+" ");
			count = i++;
			
		}
		System.out.println();
//		count++;
		}
	}

}
