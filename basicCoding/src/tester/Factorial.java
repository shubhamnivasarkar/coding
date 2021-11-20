package tester;

public class Factorial {

	// 1. without recursion

	public static int fact(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// with recursive function
	// function that class itself

	public static int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return (num * factorial(num - 1));

	}

	public static void main(String[] args) {
//		System.out.println(fact(4));
//		System.out.println(fact(1));
//		System.out.println(fact(0));

		System.out.println(factorial(4));
	}

}
