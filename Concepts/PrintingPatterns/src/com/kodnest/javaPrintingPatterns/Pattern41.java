package com.kodnest.javaPrintingPatterns;

public class Pattern41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(((i==1||i==n/2)&&(j<=n/2))||((j==1||j==n/2)&&(i<=n/2))||(i==j)&&(i>=3&&i<=7)||(i==6&&j==8))
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
