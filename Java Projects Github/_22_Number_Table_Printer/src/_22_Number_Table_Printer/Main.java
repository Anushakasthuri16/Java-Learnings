package _22_Number_Table_Printer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt(num);
		printTable();
	}
	public static void printTable(int num)
	{
		for (int i=1;i<=10;i++)
		{
		System.out.println(num + "x" +i+ "="+(num*i));
	}
}
}
