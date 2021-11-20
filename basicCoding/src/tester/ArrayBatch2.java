package tester;

import java.util.*;

public class ArrayBatch2 {
	public static void main(String[] args) {
		int array[] = new int[120];
		int num = 1;
		while (num <= 120) {
			for (int i = 0; i < array.length; i++) {
				array[i] = num;
				num++;
			}
		}
		int i;
		 int k=0;
		int counter = 40;
		while (counter <= 120) {

			for (i = k; i < counter; i++) {
				System.out.print(array[i] + " ");
				
			}
			k = i;
//			System.out.println(i);
			System.out.println();
			counter = counter + 40;
		}
	}
}
