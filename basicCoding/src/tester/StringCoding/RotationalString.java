package string;

public class RotationalString {
public static void main(String[] args) {
	String original="aradhya";
	String keys="radhyaa";
	String news= original.concat(original);
	if(news.contains(keys)) {
		System.out.println("string is rotational");
	}else {
		System.out.println("String is not rotational");
	}
}
}
