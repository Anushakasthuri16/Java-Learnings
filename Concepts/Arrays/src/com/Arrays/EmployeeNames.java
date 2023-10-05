package com.Arrays;

import java.util.Scanner;

public class EmployeeNames {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			String Names[]=new String[8];	
			for(int i=0;i<Names.length;i++)
			{
				System.out.println("Enter Score ");
				Names[i]=scan.nextLine();
			}
			System.out.println("Employee Names are: ");
			for (int i=0;i<Names.length;i++)
			{
				System.out.print(Names[i]+", ");
			}
	}

}
