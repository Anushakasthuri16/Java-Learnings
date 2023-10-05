package com.Arrays.Level3;

import java.util.Scanner;

import com.Arrays.Level4.BubbleSort;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array values: ");
		
		//Taking array Elements from the user
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		//For Sorting create the object and call method
		BubbleSort sort=new BubbleSort();
		sort.sorting(arr);
		
		//To print sorting Elements (Bubble Sort)
		System.out.println("Sorting Elements");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		
		//Take the key value from the user
		System.out.println();
		System.out.println("Enter Key Value");
		int key=scan.nextInt(); 
		
		//Binary Search 
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				System.out.println("Key Found at "+mid);
				return;
			}
			else if(key>arr[mid])      //(key<arr[mid] for descending order
			{
				low=mid+1;
				
								
			}
			else if(key<arr[mid])
			{
				high=mid-1;
	
				
			}
		}
		
		System.out.println("Key Not Found....");
		
	}

}
//Binary search is only works for ascending or descending order.
//Before searching the Elements we sort it and then search.
