package com.Arrays.level2;
import java.util.Scanner;
public class AccessElementMethod {

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
		System.out.println("Enter index of access Element: ");
		System.out.println("Selected array value is "+arr[scan.nextInt()]);
		}
	}
