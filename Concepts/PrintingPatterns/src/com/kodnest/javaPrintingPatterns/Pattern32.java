package com.kodnest.javaPrintingPatterns;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(j==n/2+1||j==1||j==n||i==n||i==1)
				{
				System.out.print("*");
				}
			else
			{
				System.out.print(" ");
			}
				
			}
			System.out.println();
		}
	}
	}


