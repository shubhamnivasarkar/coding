package binarysearch;

public class BinarySearch {

	public int search(int[] arr,int ele) {
		int left =0;
		int right = arr.length -1;
		int mid;
		while(left<=right) {
			mid = (left+right)/2;
			if(ele == arr[mid]) {
				return mid;
			}
			else if(ele<arr[mid]) {
				right = mid-1;
			}
			else
				left = mid+1;
		}
		
		return -1;
	}
}
