package string;

public class StringToIntAndViceVers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m=3;
int n=5;
switch(m/m%n) {
case 1:m=m-n;
	break;
case 2:m=m+n;
	break;
case 3:m=m*n;
	break;
case 4:m=m/n;
	break;
	default:m=m;
}
System.out.println(m);
	}

}
