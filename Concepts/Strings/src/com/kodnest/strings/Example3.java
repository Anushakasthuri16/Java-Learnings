package com.kodnest.strings;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Rama";
		String s2=new String("sita");
		String s3="Rama"+"Sita";
		String s4="Rama"+"Sita";
		if(s3==s4)
		{
			System.out.println("References of s3 and s4 are equal");
		}
		else {
			System.out.println("References of s3 and s4 are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("String of s3 and s4 are equal");
		}
		else {
			System.out.println("String of s3 and s4 are not equal");
		}
		
		String s5=s1+s2;
		String s6=s1+s2;
		if(s5==s6)
		{
			System.out.println("References of s5 and s6 are equal");
		}
		else {
			System.out.println("References of s5 and s6 are not equal");
		}
		if(s3.equals(s4))
		{
			System.out.println("String of s5 and s6 are equal");
		}
		else {
			System.out.println("String of s5 and s6 are not equal");
		}
		

	}

}
