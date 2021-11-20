package tester;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		// edge/corner cases
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println(isPrime(4));
		getPrimeNumbers(20);

	}

}

//Note: 0 and 1 are not prime numbers. 
//The 2 is the only even prime number because 
//all the other even numbers can be divided by 2.
