package com.Arrays.level2;

import java.util.Scanner;

public class DIvidedBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the values in array:  ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("5 divisibles in array are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+" | ");
			}
		}
		
	}

}
