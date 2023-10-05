package com.Arrays.level2;

public class AntiClockWise {
	public static void rotate(int arr[],int n)
	{
	for(int count=1;count<=n;count++)
	{
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}
	}

}
