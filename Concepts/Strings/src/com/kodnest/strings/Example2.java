package com.kodnest.strings;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2=new String("Rama");
		if(s1==s2)
		{
		System.out.println("References of s1 and s2 are equal");
		}
		else {
			System.out.println("References of s1 and s2 are not equal");
		}
		if(s1.equals(s2))
		{
		System.out.println("String of s1 and s2 are equal");
		}
		else {
			System.out.println("String of s1 and s2 are not equal");
		}

	}

}
