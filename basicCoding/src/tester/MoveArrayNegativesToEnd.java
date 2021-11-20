package tester;

public class MoveArrayNegativesToEnd {

	public static void reArrangeArray(int a[]) {
	int j = 0;
	int temp;
	for(int i = 0; i<a.length;i++) {
		if(a[i]<0) {
			if(i!=j) {
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
		}
	}

	}

	public static void main(String[] args) {
		int a[] = { -9, 5, 1, -2, -15, 7, 12, -3, 2 };
		reArrangeArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
