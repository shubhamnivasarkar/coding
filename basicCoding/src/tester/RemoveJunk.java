package tester;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "******** latin String 0123456";

		// using regular Expression [^a-z A-Z 0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
