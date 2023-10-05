package com.Arrays.level2;

import java.util.Scanner;

public class ClockWiseApp {

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

		System.out.print("Before Elements: ");

		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		ClockWise.rotate(arr, n);
		System.out.println();
		System.out.print("After Elements: ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
	}

}
