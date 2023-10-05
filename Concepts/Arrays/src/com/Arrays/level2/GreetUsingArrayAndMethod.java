package com.Arrays.level2;

import java.util.Scanner;

public class GreetUsingArrayAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter name: ");
		Scanner scan=new Scanner(System.in);
		String []arr=new String[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next();
		}
		greet(arr);
	}
		
		public static void greet(String arr[])
		{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Hello "+arr[i]);
		}
		

	}

}
