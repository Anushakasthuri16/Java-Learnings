package com.Arrays;

import java.util.Scanner;

public class EmployeeNamesInBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String arr[][]=new String[5][6];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the names of bank of "+i+" Employee "+j);
				arr[i][j]=scan.nextLine();
			}
		}
		System.out.println("The array contents are....");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
