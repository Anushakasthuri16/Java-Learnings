package com.kodnest.javaPrintingPatterns;

public class Pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			char a='E';
			for(int j=5;j>=i;j--)
			{
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
	}

}
