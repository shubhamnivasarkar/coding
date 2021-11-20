package tester;

import java.util.HashSet;

public class SubsetArray {

	public static boolean isSubset(int a[], int b[]) 
	{
		int n = a.length;
		int m = b.length;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i<n;i++)
		{
			if(!set.contains(a[i]))
				set.add(a[i]);
		}
		for(int i = 0;i<m;i++)
		{
			if(!set.contains(b[i]))
				return false;
		}
		return true;
		
		
	}

	public static void main(String[] args) {
	int a []= {1,2,3,4,5,6};
	int b []= {0};
	System.out.println(isSubset(a, b));
	}

}
