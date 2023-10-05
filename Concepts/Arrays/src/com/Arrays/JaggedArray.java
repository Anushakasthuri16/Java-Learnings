package com.Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
float arr[][]=new float[5][];
arr[0]=new float[4];
arr[1]=new float[2];
arr[2]=new float[5];
arr[3]=new float[6];
arr[4]=new float[3];
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println("Enter the heights of game "+i+" players"+j+" | ");
		arr[i][j]=scan.nextFloat();
	}
}
System.out.println("The array contents are....");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+ " | ");
	}
	System.out.println();
}

	}

}
