package tester;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// arr[] = {1,9,5,2,8,-1,3,55}
		// second largest is 9
		// sort the array and pick number at n-2 index
		// sorting does not work if any element is repeated in the array
		// -----------------------------------------------------------------------------
		// unsorted array
		int num[] = { 1, 9, 5, 55, 2, 8, -1, 3, 55 };
		int n = num.length;

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (num[i] > highest) {

				secondHighest = highest;
				highest = num[i];
			}
			if (num[i] < highest && num[i] > secondHighest) {
				secondHighest = num[i];
			}
		}

		System.out.println("Second highest number is " + secondHighest);
	}

}
