package tester;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int a[] = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		int b[] =new int[max+1];
		for(int i = 0;i<a.length;i++)
		{
			b[a[i]]++;
		}
		for(int i =0; i<max;i++) {
			if(b[i]>1) {
				System.out.println("Repeated element = "+ i + " occurences = "+b[i]);
			}
		}
	}

}
