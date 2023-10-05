package com.Arrays.level2;

import java.util.Scanner;

public class ModifyElementMethod {
	public static void main(String[] args) {
	
		System.out.println("Enter array length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the values in array:  ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Select modify position and value");
		arr[scan.nextInt()]=scan.nextInt();
		System.out.println("Modified values are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}
}
