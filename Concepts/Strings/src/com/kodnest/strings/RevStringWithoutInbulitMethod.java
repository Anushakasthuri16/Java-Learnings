package com.kodnest.strings;

import java.util.Scanner;

public class RevStringWithoutInbulitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] arr1=str.toCharArray();		
		char[] arr2=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr2[j]=arr1[i];
			j--;
		}
		String str1=new String(arr2);
		System.out.println("Reversed Array: "+str1);
		
		
		
	

					
		

	}

}
