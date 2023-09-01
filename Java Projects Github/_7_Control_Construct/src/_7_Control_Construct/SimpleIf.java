package _7_Control_Construct;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter your marks: ");
Scanner scan=new Scanner(System.in);
int marks=scan.nextInt();
System.out.println("Welcome to Kodnest");
techClub(marks);

	}
	
public static void techClub(int marks)
{
	if (marks>=80)
			{
		System.out.println("Welcome to Tech Club");
			}
}
}
