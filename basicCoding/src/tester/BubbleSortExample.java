package tester;

public class BubbleSortExample {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n ; i++) {  // iterating through list
			for (int j = 0; j < n-1; j++) { // comparing first element with next element
				if (arr[j] > arr[j+1]) {
					// swap the values
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
		System.out.println("Array before bubble sort : -");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after bubble sort : -");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
