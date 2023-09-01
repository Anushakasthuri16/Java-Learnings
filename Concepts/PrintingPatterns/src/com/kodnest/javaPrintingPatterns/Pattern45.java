package com.kodnest.javaPrintingPatterns;

public class Pattern45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
			
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
				
			}

			char a='E';
			for(int k=1;k<=i;k++)
			{
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
	}

}
