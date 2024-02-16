package com.kodnest.strings;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		char arr[]=new char[scan.nextInt()];
		System.out.println("Enter Array characters");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		System.out.print("Array---> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		char arr2[]=new char[arr.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			arr2[j]=arr[i];
			j--;
		}
		System.out.println();
		System.out.print("Array 2 ---->  ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr2[i]+" | ");
		}
		System.out.println();
		String s=new String(arr2);
		System.out.println(s);

	}

}
