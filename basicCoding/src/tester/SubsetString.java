package tester;

import java.util.HashSet;

public class SubsetString 
{

	//using regex
	public static boolean isSubstring(String main, String sub)
	{
		return main.matches("(.*)" + sub + "(.*)");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(isSubstring("PrateekSoftware Developer","Pra"));
		
	}

}
