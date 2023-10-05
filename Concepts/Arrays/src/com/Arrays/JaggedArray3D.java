package com.Arrays;

import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int sch[][][]=new int[2][][];
	sch[0]=new int[2][];
	sch[1]=new int[3][];
	
	sch[0][0]=new int[3];
	sch[0][1]=new int[4];
	
	sch[1][0]=new int[3];
	sch[1][1]=new int[2];
	sch[1][2]=new int[4];
	
	for(int i=0;i<=sch.length-1;i++)
	{
		for(int j=0;j<=sch[i].length-1;j++)
		{
			for(int k=0;k<=sch[i][j].length-1;k++)
			{
				System.out.println("Enter "+i+ " School "+j+ " Class "+k+" Student ");
				sch[i][j][k]=scan.nextInt();
			}
		}
	}
	System.out.println("Array contents are.....");

	for(int i=0;i<=sch.length-1;i++)
	{
		for(int j=0;j<=sch[i].length-1;j++)
		{
			for(int k=0;k<=sch[i][j].length-1;k++)
			{
				System.out.print(sch[i][j][k]+" | ");
			}
			System.out.println();
		}
		System.out.println();
		}

	}

}
