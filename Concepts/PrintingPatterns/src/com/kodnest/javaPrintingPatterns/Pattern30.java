package com.kodnest.javaPrintingPatterns;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(i==n/2||j==n/2)
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
