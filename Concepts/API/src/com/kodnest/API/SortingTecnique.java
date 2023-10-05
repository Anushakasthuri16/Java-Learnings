package com.kodnest.API;

import java.util.Scanner;

public class SortingTecnique {
	public int algorithm(int arr[])
	{
		Scanner scan=new Scanner(System.in);
		KodNestSearchSort kss=new KodNestSearchSort();
		System.out.println("Enter Your Choice");
		System.out.println("Press 1 -------> Bubble Sort");
		System.out.println("Press 2 -------> Selection Sort");
		System.out.println("Press 3 -------> Insertion Sort");
		int choice3=scan.nextInt();
		
		System.out.println("Enter Your Choice");
		System.out.println("Press 1 -------> Ascending Order Sort");
		System.out.println("Press 2 -------> Descending Order Sort");
		int choice4=scan.nextInt();
		
		if(choice3==1)
		{
										
			
			if(choice4==1)
			{
				kss.bubbleSortAscending(arr);
			}
			else if(choice4==2)
			{
				kss.bubbleSortDescending(arr);	
			}
			else
			{
				System.out.println("Please select 1 or 2 only");
				return -1;
			}
			
		}
	
		else if(choice3==2)
		{
			
			
			if(choice4==1)
			{
			kss.selectionSortAscending(arr);
			}
			else if(choice4==2)
			{
				kss.selectionSortDescending(arr);	
			}
			else
			{
				System.out.println("Please select 1 or 2 only");
				return -1;
			}

		}
		else if(choice3==3)
		{
			
			if(choice4==1)
			{
				kss.insertionSortAscending(arr);
			}
			else if(choice4==2)
			{
				kss.insertionSortDescending(arr);	
			}
			else {
				System.out.println("Please select 1 or 2 for order of sorting");
				return -1;
			}

		}
		else 
		{	
			System.out.println("Sorting is not performed");
			System.out.println("Please select 1 (bubble sort) or 2 (selection sort) or 3(Insertion sort) to sort the array elements");
			return -1;
		}
	
	System.out.print("After sorting: ");
	for(int i=0;i<=arr.length-1;i++)
	{
	
	System.out.print(arr[i]+ " | ");
	}
	System.out.println();
	return -1;
	}
}
