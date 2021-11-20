package string;

public class DeleteOccOfGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="spiderslies";
char y[]=x.toCharArray();
int size=y.length;
char key='s';
int i=0;
String res="";
while(i!=size) {
	if(y[i]!=key) {
		res=res+y[i];
	}
	i++;
}
System.out.println(res);
	}

}
