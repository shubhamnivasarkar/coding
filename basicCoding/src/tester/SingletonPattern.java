package tester;

public class SingletonPattern {

	private static SingletonPattern ss = null;
	public String str;

	private SingletonPattern() {
		str = "Hello Anuja";
	}

	public static SingletonPattern getInstance() {
		if (ss == null)
			ss = new SingletonPattern();
		return ss;
	}

	public static void main(String[] args) {
		SingletonPattern x = SingletonPattern.getInstance();
		SingletonPattern y = SingletonPattern.getInstance();
		SingletonPattern z = SingletonPattern.getInstance();

		x.str = (x.str).toUpperCase();
		y.str = (y.str).toUpperCase();
		z.str = (z.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
