package com.kodnest.strings;

import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a String");

		String str=scan.nextLine();

		findSubString(str);

		}

		public static void findSubString(String str)

		{

		String max="";

		for(int i=0;i<=str.length()-1;i++)

		{

		for(int j=i+1;j<=str.length();j++)

		{

		String subString=str.substring(i, j);

		boolean res=isUnique(subString);

		if(res==true)

		{

		if(subString.length()>max.length())

		{

		max=subString;

		}

		}

		}

		}

		System.out.println("Max Unique SubString is "+max);

		}

		public static boolean isUnique(String s)

		{

		for(int i=0;i<=s.length()-1;i++)

		{

		for(int j=i+1;j<=s.length()-1;j++)

		{

		if(s.charAt(i)==s.charAt(j))

		{

		return false;

		}

		}

		}

		return true;

		}

		}