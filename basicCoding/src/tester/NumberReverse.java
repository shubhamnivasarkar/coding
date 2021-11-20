package tester;

public class NumberReverse {

	public static void main(String[] args) {

		int num = 1234;
		int org_num = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10; // num % 10 => finds the 1s digit of the number || 
									  // rev * 10 => push the digit to the right of the rev 
			num = num / 10;  // num = num/10 => eliminates the 1s digit of the num
		}
		System.out.println(" Original number :- " + org_num + " Reverse of the number :- " + rev);
	}

}
