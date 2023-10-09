package com.Arrays.level2;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st array row length and col length");
		int m=scan.nextInt();
		int n=scan.nextInt();
		System.out.println("1st array col size and 2nd array row size must be same");
		System.out.println("Enter 2nd array row length and col length");
		int m1=scan.nextInt();
		int n1=scan.nextInt();
	
		int arr[][]=new int[m][n];
		int arr1[][]=new int[m1][n1];
		
		
		
		System.out.println("Enter array Elments");
		for(int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Enter 1 array Elments");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for (int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=scan.nextInt();
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
		System.out.println("The 1 array Elements are");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for (int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" | ");
			}
			System.out.println();
		}
		int arr2[][]=new int[m][n1];   //1st array row size and 2nd array column size
		int sum=0;
		for(int i=0;i<=m;i++)  //rows 
		{
			for (int j=0;j<=m;j++)    //columns
			{
				for (int k=0;k<=m;k++)    //columns
				{
					sum=sum+(arr[i][j]*arr1[i][j]);
				}
				arr2[i][j]=sum;
				
			}
			System.out.println();
		}
		System.out.println("The sum of array elements are");
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
