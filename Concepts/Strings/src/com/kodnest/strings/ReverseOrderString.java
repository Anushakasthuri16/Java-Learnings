package com.kodnest.strings;

import java.util.Scanner;

public class ReverseOrderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();

		String arr1[]=s1.split(" ");
		for(int i=0;i<=arr1.length-1;i++)
		{
		System.out.println(arr1[i]);
		}
		String arr2[]=new String[arr1.length];
		String revSen="";
	
		for(int i=0;i<=arr1.length-1;i++)
		{
			int j=arr2.length-1;
			arr2[j]=arr1[i];
			revSen=arr2[j]+" "+revSen;
			j--;
		}
		
		
		System.out.println(revSen);
			
		
	}

}
