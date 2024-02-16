package com.Exceptions;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int a=scan.nextInt();
		System.out.println("Enter 2nd number");
		int b=scan.nextInt();
		try
		{
			add(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled in Main Method");
		}
		System.out.println("Addition Completed");
		System.out.println("============================================");
		sub(a,b);
		mul(a,b);
		try
		{
			div(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Thrown Exception Handled in Main Method");
		}
		System.out.println("============================================");

		
	}
	
	
	public static void add(int a,int b) throws Exception
	{
		System.out.println("Addition Started");
		int addres=a+b;
		System.out.println("Addition of a and b is: "+addres);	
	}
	public static void sub(int a,int b)
	{
		try
		{
		System.out.println("Subtraction Started");
		int subres=a-b;
		System.out.println("Subtraction of a and b is: "+subres);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled by subtraction Method");
		}
		System.out.println("Subtraction is completed");
		System.out.println("============================================");
	}
	public static void mul(int a,int b) 
	{
		try
		{
		System.out.println("Multiplication Started");
		int mulres=a*b;
		System.out.println("Multiplication of a and b is: "+mulres);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled by Multiplication Method");
		}
		System.out.println("Multiplication is completed");
		System.out.println("============================================");
	}
	public static void div(int a,int b)  
	{
		try {
		System.out.println("Division Started");
		int divres=a/b;
		System.out.println("Division of a and b is: "+divres);	
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in div method");
			throw e;
			
		}
		finally
		{
		System.out.println("Division is completed");
		
		}
	}




}
