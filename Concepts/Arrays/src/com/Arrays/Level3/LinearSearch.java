package com.Arrays.Level3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array values: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter Key Value");
		int key=scan.nextInt();
	
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
				
			{
				System.out.println("Key Found at "+i);
				return;
			}
		}
		System.out.println("Key Not Found...");

	}

}

