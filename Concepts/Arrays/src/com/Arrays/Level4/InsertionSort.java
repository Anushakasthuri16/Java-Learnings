package com.Arrays.Level4;

import java.util.Scanner;

public class InsertionSort {
	public void InsertionSort(int arr[])
	{
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=item;
			
		}
	}

}
