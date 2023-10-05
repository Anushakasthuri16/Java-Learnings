package com.Arrays;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter ");
			
			arr[i]=scan.nextInt();
		}
		System.out.println("Arrays are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
