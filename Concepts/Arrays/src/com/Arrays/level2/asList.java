package com.Arrays.level2;

import java.util.Arrays;
import java.util.Scanner;

public class asList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ");
Scanner scan=new Scanner(System.in);
int arr[]=new int[scan.nextInt()];
for(int i=0;i<=arr.length-1;i++)
{
arr[i]=scan.nextInt();
}
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("Array As List: "+Arrays.asList(arr));
}
}
}
