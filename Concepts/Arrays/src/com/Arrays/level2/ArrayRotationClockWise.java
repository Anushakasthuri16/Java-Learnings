package com.Arrays.level2;

import java.util.Scanner;

public class ArrayRotationClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the rotations you want");
		int n=scan.nextInt();
		System.out.println("Enter array Elments");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}

		System.out.print("Before Elements");
		System.out.println();
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}

		for(int count=1;count<=n;count++)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--)
			{
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		System.out.println("After Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}

}
