package quicksort;

public class QuickSort {

	public void swap(int[] arr, int i,int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public int split(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i =(left -1);
		for(int j=left; j<=right-1;j++) {
			if(arr[j]<=pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,right);
		return (i+1);
	}
	public void quicksort(int[] arr,int left,int right) {
		if(left<right) {
			int part= split(arr,left,right);
			quicksort(arr, left, part-1);
			quicksort(arr, part+1, right);
		}
	}
	
}
