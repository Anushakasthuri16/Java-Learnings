package com.kodnest.training.java;

import java.util.Scanner;

public class anu 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
			
		System.out.println("Enter student name: ");
		String a = scan.nextLine();	
		System.out.println("Given name is: "+a);
		
		System.out.println("Enter student Stream: ");
		String a1 = scan.nextLine();	
		System.out.println("Given Stream is: "+a1);
		
		System.out.println("Enter student age: ");
		int b = scan.nextInt();	
		System.out.println("Given age is: "+b);
		
		System.out.println("Enter student CGPA: ");
		float c = scan.nextFloat();	
		System.out.println("Given CGPA is: "+c);
		
		System.out.println("Enter student height: ");
		double d = scan.nextDouble();	
		System.out.println("Given height is: "+d);
		
		System.out.println("Is student is graduated or not?Enter true or false: ");
		boolean e = scan.nextBoolean();	
		System.out.println("Is student is graduated?: "+e);
		
		System.out.println("Enter college name: ");
		scan.nextLine();
		String f = scan.nextLine();	
		System.out.println("Given Stream is: "+f);
		
		System.out.println("Enter college name: ");
		String f1 = scan.nextLine();	
		System.out.println("Given Stream is: "+f1);
		
	}
}
