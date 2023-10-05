package _37_Sum_Of_ElementsIn1And2GiveItTo3;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array 1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter array 1 Elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
	
		System.out.println();
		System.out.println("Array 2 length same as array 1");
		int arr2[]=new int[arr1.length];
		System.out.println("Enter array 2 Elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		
		}
		
		int arr3Len=arr1.length;
		
		int arr3[]=new int[arr3Len];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		System.out.println();
		System.out.print("Arr1==> ");
		for(int i=0;i<=arr1.length-1;i++)
		{
		System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.print("Arr2==> ");
		for(int i=0;i<=arr2.length-1;i++)
		{
		System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print("arr3==> ");
		for(int i=0;i<=arr3.length-1;i++)
		{
		System.out.print(arr3[i]+" ");
		}


	}

}
