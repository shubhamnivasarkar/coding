package tester;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1; // to start form previous item
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;

		}
	}

	public static void main(String[] args) {
		int array[] = { 5,3,3,3,3 };
		sort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
