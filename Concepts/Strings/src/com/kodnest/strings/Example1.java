package com.kodnest.strings;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2="Rama";
		if(s1==s2)
		{
			System.out.println("References of s1 and s2 are equal");
		}
		else {
			System.out.println("References of s1 and s2 are not equal");
		}
		
		String s3=new String("sita");
		String s4=new String("sita");
		if(s3==s4)
		{
			System.out.println("References of s3 and s4 are equal");
		}
		else {
			System.out.println("References of s3 and s4 are not equal");
		}
		if(s1.equals(s2))
		{
			System.out.println("String of s1 and s2 are equal");
		}
		else {
			System.out.println("String of s1 and s2 are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("String of s3 and s4 are equal");
		}
		else {
			System.out.println("String of s3 and s4 are not equal");
		}
		}

}
