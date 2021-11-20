package tester;

public class StringMethods {

	public static void main(String[] args) {

		String s = "word";
		String s1 = "mywordierwords";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
//		System.out.println(s.toUpperCase());
//		System.out.println(s1.toLowerCase());

		if (s1.startsWith("word")) {
			System.out.println("s1 starts with word ");
		} else {
			System.out.println("s1 do not start with word ");
		}
		if (s1.endsWith("word")) {
			System.out.println("s1 ends with word ");
		} else {
			System.out.println("s1 do not end with word ");
		}
		if (s.equalsIgnoreCase(s1)) {
			System.out.println("equals :- true");
		} else {
			System.out.println("equals :- false");
		}
	}

}
