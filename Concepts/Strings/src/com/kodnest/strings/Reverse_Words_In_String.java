package com.kodnest.strings;

import java.util.Scanner;

public class Reverse_Words_In_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
Scanner scan=new Scanner(System.in);
String s1=scan.nextLine();

String arr1[]=s1.split(" ");
String arr2[]=new String[arr1.length];



String revSen="";
String revWord="";
for(int i=0;i<=arr1.length-1;i++)
{
	
	String word=arr1[0];
	
	
	int j=arr1[0].length()-1;
		
		
		revWord=revWord+arr2[j];
		j--;
}
revSen=revSen+revWord+" ";
System.out.println(revSen);
	}

}
