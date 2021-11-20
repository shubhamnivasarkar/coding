package tester;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Prateek";
		String rev = "";
//		using charAt()
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Original :- " + str);
		System.out.println("Reverse using charAt :- " + rev);

		// using character array ->
//		char a[] = str.toCharArray();
//		int len2 = a.length;
//		for (int i = len2- 1; i >= 0; i--) {
//			rev = rev + a[i];
//		}
//		System.out.println("Original :- " + str);
//		System.out.println("Reverse using character Array  :- " + rev);

		/// using stringBuffer class
//		StringBuffer sb = new StringBuffer(str);
//		System.out.println(sb);
//		System.out.println(sb.reverse());
	}

}
