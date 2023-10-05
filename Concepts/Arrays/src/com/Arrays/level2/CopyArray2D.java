package com.Arrays.level2;

import java.util.Scanner;

public class CopyArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array length");
		Scanner scan=new Scanner(System.in);
		
		int arr[][]=new int[2][scan.nextInt()];
		System.out.println("Enter array Elments");
		for(int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		System.out.println("The Elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
		int arr2[][]=new int[arr.length][arr.length];
		for(int i=0;i<=arr2.length-1;i++)
		{
			for (int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("The copied elements are");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for (int j=0;j<=arr2[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" | ");
			}
			System.out.println();
		}



	}

}
