package com.Arrays;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int score[]=new int[5];	
		for(int i=0;i<score.length;i++)
		{
			System.out.println("Enter Score ");
			score[i]=scan.nextInt();
		}
		System.out.println("Student marks is: ");
		for (int i=0;i<score.length;i++)
		{
			System.out.print(score[i]+" ");
		}
			
	}

}
