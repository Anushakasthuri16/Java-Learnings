package com.kodnest.API;

import java.util.Scanner;

public class KodNestSearchSort

		{

		int linearSearch(int arr[],int key)

		{
			for(int i=0;i<=arr.length-1;i++)
			{
				if(key==arr[i])
					
				{
					System.out.println("Key Found at "+i);
					return i;
					
				}
			
			}
			System.out.println("Key not Found");
			return -1;
		}

		int binarySearchAsc(int arr[],int key)

		{	 
			
			int low=0;
			int high=arr.length-1;
			while(low<=high)
			{
				
				int mid=(low+high)/2;
				if(key==arr[mid])
				{
					
					return mid;
				}
				else if(key>arr[mid])      //(key<arr[mid] for descending order
				{
					low=mid+1;
					
									
				}
				else if(key<arr[mid])
				{
					high=mid-1;
		
				}
				else {
					System.out.println("Key Not Found");
				}
			}
			
			return -1;

		}
		int binarySearchDsc(int arr[],int key)

		{	 
			
			int low=0;
			int high=arr.length-1;
			while(low<=high)
			{
				
				int mid=(low+high)/2;
				if(key==arr[mid])
				{
					
					return mid;
				}
				else if(key<arr[mid])      //(key<arr[mid] for descending order
				{
					low=mid+1;
					
									
				}
				else if(key>arr[mid])
				{
					high=mid-1;
		
				}
				else {
					System.out.println("Key Not Found");
				}
			}
			
			return -1;
		}

		void bubbleSortAscending(int arr[])

		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}

		void bubbleSortDescending(int arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-2-i;j++)
				{
					if(arr[j]<arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}

		void selectionSortAscending(int arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				int min=arr[i];
				int pos=i;
				
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]<min)
					{
						min=arr[j];
						pos=j;
					}
				}
				int help=arr[pos];
				arr[pos]=arr[i];
				arr[i]=help;
			}
		}

		void selectionSortDescending(int arr[])
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				int min=arr[i];
				int pos=i;
				
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]>min)
					{
						min=arr[j];
						pos=j;
					}
				}
				int help=arr[pos];
				arr[pos]=arr[i];
				arr[i]=help;
			}
		}

		void insertionSortAscending(int arr[])
		{
			for(int i=1;i<=arr.length-1;i++)
			{
				int item=arr[i];
				int j=i-1;
				while(j>=0 && arr[j]>=item)
				{
					arr[j+1]=arr[j];
					j--;
					
				}
				arr[j+1]=item;
			}
				
		}

		void insertionSortDescending(int arr[])
		{
			for(int i=1;i<=arr.length-1;i++)
			{
				int item=arr[i];
				int j=i-1;
				
				while(j>=0 && arr[j]<item)
				{
					arr[j+1]=arr[j];
					j--;
					
				}
				arr[j+1]=item;
			}
		}
		
		//Creating the object for sorting class to sort the array Elements
		SortingTecnique st=new SortingTecnique();
		
		//Finding Minimum without any Sorting.
		int findMin(int arr[])
		{
			int min=arr[0];
			for(int j=1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					
				}
			}
			return min;
		}
		Scanner scan =new Scanner(System.in);

		//Finding Minimum using Sorting.
		int findMinWithSort(int arr[])
		{
			int res=st.algorithm(arr);
			if(res!=-1)
			{
			System.out.println("Enter The search you performed above  1 for Ascending and 2 for Descending ");
			
			int s=scan.nextInt();
			if(s==1)
			{
		
			return arr[arr.length-1];
			}
			return arr[0];
			}
			return -1;

		}
		
		//Finding Maximum without any Sorting.
		int findMax(int arr[])
		{ 
			int max=arr[0];
			
			
			for(int j=1;j<=arr.length-1;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				
				}
			}
			return max;
		}
		
		//Finding Maximum using Sorting.
		int findMaxWithSort(int arr[])
		{
			int res=st.algorithm(arr);
			if(res!=-1)
			{
			System.out.println("Enter The search you performed above  1 for Ascending and 2 for Descending");
			int s=scan.nextInt();
			if(s==1)
			{
			return arr[arr.length-1];
			}
			return arr[0];
			}
			return -1;
		}




}
