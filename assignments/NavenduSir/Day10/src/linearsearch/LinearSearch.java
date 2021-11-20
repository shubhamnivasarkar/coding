package linearsearch;

public class LinearSearch {
	
	public int linearSearchHelper(int arr[],int x) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==x)
				return i;
		}
		return -1;
	}
	

}
