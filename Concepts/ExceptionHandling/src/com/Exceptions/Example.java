package com.Exceptions;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Element");
		int a=scan.nextInt();
		System.out.println("Enter Second Element");
		int b=scan.nextInt();
		divide(a,b);
		
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter Array index ");
		int index=scan.nextInt();
		System.out.println("Enter Array  Element");
		int ele=scan.nextInt();
		arr[index]=ele;
		System.out.println("Element is inserted");
	}
		catch(ArithmeticException ae)
		{
		System.out.println("Arthimetic exception is handled");
		}
		catch(ArrayIndexOutOfBoundsException aob)
		{
		System.out.println(" Array index out of bound exception is handled");
		}
		catch(NegativeArraySizeException nas)
		{
		System.out.println("Negative Array index size exception is handled");
		}



		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static void divide(int a,int b)
{
	System.out.println("Division Started");

	int div=a/b;
	System.out.println("Division result of a and b is "+div);
	
	
	System.out.println("Division Ended");
	
}

	

}
