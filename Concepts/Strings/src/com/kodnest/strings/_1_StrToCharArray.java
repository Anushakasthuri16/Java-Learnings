package com.kodnest.strings;

import java.util.Scanner;

public class _1_StrToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		
		
		char arr[]=str.toCharArray();


		/* for(int i=0;i<=arr.length-1;i++)
		{
			
		System.out.println(arr[i]);
		} */
		
		for(char x:arr)
		{
			System.out.println(x);
		}
		
		

	}

}
