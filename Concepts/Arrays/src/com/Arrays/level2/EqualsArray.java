package com.Arrays.level2;
import java.util.Arrays;
import java.util.Scanner;
	public class EqualsArray {
		public static void main(String[] args) {
		System.out.println("Enter array length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the values in array 1:  ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter array length: ");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the values in array 2:  ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("Both arrays are "+Arrays.equals(arr,arr2));
	}
}
