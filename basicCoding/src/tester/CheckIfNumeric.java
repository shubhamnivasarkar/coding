package tester;

public class CheckIfNumeric {
// String is already a CharSequence
	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static int isNumeric(CharSequence cs) {
		int count = 0;
		if (isEmpty(cs)) {
			return 0;
		}
		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(cs.charAt(i))) {
				count++;
			}
		}
		System.out.print(" numbers  in the given string are:- " );
		return count;
		

	}

	public static void main(String[] args) {
		System.out.println(isNumeric("prateek123"));
	}

}
