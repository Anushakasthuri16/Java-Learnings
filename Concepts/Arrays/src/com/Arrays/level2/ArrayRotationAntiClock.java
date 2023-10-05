package com.Arrays.level2;

import java.util.Scanner;

public class ArrayRotationAntiClock {

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

		System.out.println("Before Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" | ");
		}

		for(int count=1;count<=n;count++)
		{
			int temp=arr[0];
			for(int i=1;i<=arr.length-1;i++)
			{
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=temp;
		}
		System.out.println("AfterElements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}

}
