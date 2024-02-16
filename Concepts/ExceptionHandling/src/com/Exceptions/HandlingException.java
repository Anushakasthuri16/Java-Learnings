package com.Exceptions;

import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Calculation started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Element");
		int a=scan.nextInt();
		System.out.println("Enter Second Element");
		int b=scan.nextInt();
		divide(a,b);
		System.out.println("Calculation Ended");
		
		
		
	}
	public static void divide(int a,int b)
	{
		
	System.out.println("Division Started");
	try
	{
	int div=a/b;
	System.out.println("Division result of a and b is "+div);
	}
	catch(Exception e)
	{
		System.out.println("Exception is handled in divide");
		
	}


}
}
