package com.kodnest.API;

import java.util.Scanner;

public class KodnestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length: ");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter array values: ");
		
		//To take the array Elements from the user
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//To print the elements before sorting
		System.out.print("Before sorting: ");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.print(arr[i]+ " | ");
		}
		System.out.println();
		
		
		while(true)
		{
			System.out.println("Enter Your Choice");
			System.out.println("Press 1 -------> Searching");
			System.out.println("Press 2 -------> Sorting");
			System.out.println("Press 3 -------> FindMin & FindMax ");
			System.out.println("Press other -------> TATA BYE BYE");
			
			int choice=scan.nextInt();
			KodNestSearchSort kss=new KodNestSearchSort(); 		//Instantiating the KodNestSearchSort //Object Creation
			SortingTecnique st=new SortingTecnique();           //Instantiating the SortingTechique //Object Creation

			
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Your Choice");
				System.out.println("Press 1 -------> Linear Search");
				System.out.println("Press 2 -------> Binary Search");
				int choice1=scan.nextInt();
				
				if(choice1==1)          //Linear Search
				{	
					System.out.println("Enter key to Search");
					int key=scan.nextInt();
					int res=kss.linearSearch(arr,key);
					System.out.println(res);
				}
				
				else if(choice1==2)     //Binary Search
				{
					System.out.println("Enter key to Search");
					int key=scan.nextInt();
					st.algorithm(arr);   //for sorting
					System.out.println("Enter The order of sort you performed above  1 for Ascending and 2 for Descending");
					int s=scan.nextInt();
					if(s==1)
					{
						int res=kss.binarySearchAsc(arr, key);
						System.out.println("Key found at "+res);
					}
					
					else
					{
						int res=kss.binarySearchDsc(arr, key);
						System.out.println("Key found at "+res);
					}
				}
				else
				{
					System.out.println("Please select the searching options 1 or 2");
				}
			
				break;
			}
				
			
			case 2:
			{
				
				st.algorithm(arr);         //Method call of sorting followed by reference variable
				break;
			}
			case 3:
			{
				
				System.out.println("Enter Your Choice");
				System.out.println("Press 1 -------> Find Minimum");
				System.out.println("Press 2 -------> Find Maximum");
				
				int choice2=scan.nextInt();
				System.out.println("Enter Your Choice");
				System.out.println("Press 1 -------> With Sort");
				System.out.println("Press 2 -------> Without Sort");
				
				int choice3=scan.nextInt();
				if(choice2==1)
				{
					if(choice3==1)
						{
							int min=kss.findMinWithSort(arr);
							if(min!=-1)
							System.out.println("Minimum number with sorting is: "+min);
						}
						else if(choice3==2)
						{
							int min=kss.findMin(arr);
							if(min!=-1)
							System.out.println("Minimum number without sorting is: "+min);
						}
						else 
						{
							System.out.println("Please select 1 or 2 only");
						}

				}
				else if(choice2==2)
				{
					
						if(choice3==1)
						{
							int max=kss.findMaxWithSort(arr);
							if (max!=1)
							System.out.println("Maximum number with sorting is:  "+max);
						}
						else if(choice3==2)
						{
							int max=kss.findMax(arr);
							if(max!=1)
							System.out.println("Miximum number without sorting is: "+max);
						}
						else {
							System.out.println("Please select 1 or 2 only");
						}
					
				}
				else
				{		System.out.println("We can't find it");
						System.out.println("Please choose 1----> min and 2 ---->max");
				}
				break;
			
			}
			default:
				System.out.println("Sorry.. No more services are avalible Here.....");
				break;
		}
	
		return;
		}	
	}
}

