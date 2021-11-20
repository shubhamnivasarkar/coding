package tester;

public class SwapNoWithoutThirdVariable {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		System.out.println(x + " " + y);
//		// with using temp variable t
//
//		int t;
//		t = x;
//		x = y;
//		y = t;
//		System.out.println("using 3rd variable");
//		System.out.println(x + " " + y);
//
//		// without using third variable
//		// using + variable;
//		x = x + y; // x = 15
//		y = x - y; // y = 5
//		x = x - y; // x = 10
//
//		System.out.println("using + ");
//		System.out.println(x + " " + y);
//
//		// using *
//		x = x * y; // x = 50
//		y = x / y; // y = 5
//		x = x / y; // x = 10
//
//		System.out.println("using * ");
//		System.out.println(x + " " + y);

		// using XOR

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("using XOR");
		System.out.println(x + " " + y);
	}

}
