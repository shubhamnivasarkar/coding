package tester;

public class InsertionSort2 {

	private static int[] sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
		return a;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int array[] = { 20, 30, 1, 222, 65 };
		InsertionSort2.sort(array);
		printArray(array);
	}

}
