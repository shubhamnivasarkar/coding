package tester;

import java.util.Arrays;

public class AngramDemo {

	public static void main(String[] args) {
		String str1 = "More";
		String str2 = "Remo";
		System.out.println("Are Strings Anagram?? ");
		System.out.println(" " + isAngram(str1.toLowerCase(), str2.toLowerCase()));
	}

	public static boolean isAngram(String str1, String str2) {
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
	}
}
