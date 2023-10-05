package com.Arrays.Level4;

import java.util.Scanner;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array values: ");
		
		//To take the array Elements from the user
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//To print the elements before sorting
		System.out.print("Before sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
		
		System.out.print(arr[i]+ " | ");
		}
		
		//Object Creation
		 new InsertionSort().InsertionSort(arr);
		
		//To print After sorting
		System.out.println();
		System.out.print("After sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" | ");
		}

	}

}
