package tester;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean flag = false;
		int key = 6;
		int l = 0;
		int h = a.length - 1;
		System.out.println("Binary Search");
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element " + key + " found at index " + m);
				flag = true;
				break;
			}
			if (key > a[m]) {
				l = m + 1;
			}
			if (key < a[m]) {
				h = m - 1;
			}
		}
		if (flag == false) {
			System.out.println("Element not  found");
		}

	}

}
