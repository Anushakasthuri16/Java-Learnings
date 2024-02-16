package com.Exceptions;

import java.util.Scanner;

public class PropagationOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculation started");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first Element");
		int a=scan.nextInt();
		System.out.println("Enter Second Element");
		int b=scan.nextInt();
		multiply(a,b);
		System.out.println("Calculation Ended");
		
		
	}
public static void multiply(int a,int b)
{
	System.out.println("Multiplication started");
	int mul=a*b;
	System.out.println("Multiplication of and b is "+mul);
	divide(a,b);
	System.out.println("Multiplication Ended");
	
}
public static void divide(int a,int b)
{
	System.out.println("Division Started");
	
	int div=a/b;
	System.out.println("Division result of a and b is "+div);
	
	
	System.out.println("Division Ended");
	
}
}

//jvm tried to check the control if there is any u.d.e.h is present are not , if present control will send other wise
//jvm check its caller method ,there is u.d.e.h then default exception handler will handle the exception 
//,transfering from one method to its caller method is propagation
