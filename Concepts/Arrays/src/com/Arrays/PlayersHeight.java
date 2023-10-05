package com.Arrays;

import java.util.Scanner;

public class PlayersHeight {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			double height[]=new double[10];	
			for(int i=0;i<height.length;i++)
			{
				System.out.println("Enter Score ");
				height[i]=scan.nextDouble();
			}
			System.out.println("Players Heights: ");
			for (int i=0;i<height.length;i++)
			{
				System.out.print(height[i]+", ");
			}
	}

}
