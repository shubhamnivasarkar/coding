package tester;

public class StringSwapwithoutThird {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";

		System.out.println("Before swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// append a+b
		a = a + b; // a = HelloWorld

		// Store initial string a in String b
		b = a.substring(0, a.length() - b.length());

		// store initial b in a

		a = a.substring(b.length());
		System.out.println("after swapping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
