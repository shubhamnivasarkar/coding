package tester;

public class ArrayReverse {
	static void reverse(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j--;
		}
		System.out.println("reversed array is : - ");
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + ",");
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		System.out.println("Original array is:- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
		reverse(a, a.length);
	}

}
