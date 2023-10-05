package com.Arrays.Level4;

import java.util.Scanner;

public class SelectionSorting {

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
		
		
		for(int i=0;i<=arr.length-2;i++)
		{
			int min=arr[i];
			int pos=i;
			
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int help=arr[pos];
			arr[pos]=arr[i];
			arr[i]=help;
		}
		
		//To print After sorting
		System.out.println();
		System.out.print("After sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+" | ");
		}

	}
	}


