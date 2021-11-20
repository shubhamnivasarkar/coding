package bubblesort;

public class BubbleSort {

	public void bubbleSort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=1; j<(arr.length-i); j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
