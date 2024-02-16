package com.Exceptions;

import java.util.Scanner;

public class DuckingTheException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculation started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Element");
		int a=scan.nextInt();
		System.out.println("Enter Second Element");
		int b=scan.nextInt();
		try
		{
			divide(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in main method");
		}
		System.out.println("Calculation Ended");


	}
	public static void divide(int a,int b)
	{
		System.out.println("Division Started");
		
		int div=a/b;
		System.out.println("Division result of a and b is "+div);
		
		
		System.out.println("Division Ended");
		
	}
}
