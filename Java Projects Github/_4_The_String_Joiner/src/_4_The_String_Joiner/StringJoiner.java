package _4_The_String_Joiner;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Strings: ");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		System.out.println("Join String is "+joinStrings(str1,str2));
}
	public static String joinStrings(String str1, String str2)
	{
	return str1+str2;	
	}
}
