package UserInput;

import java.util.Scanner;

public class Array2DJaggedUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter 1D array length...");
int arr[][]=new int[scan.nextInt()][];

	for(int i=0;i<=arr.length-1;i++)
	{	
		System.out.println("Enter 2D array length of 1D array "+i);
		arr[i]=new int[scan.nextInt()];
	}

	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("Enter "+i+" class "+j+ " Students ");
			arr[i][j]=scan.nextInt();		}
	}
	System.out.println("Array Contents are....");
	System.out.println("-----------------");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print("| ");
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print(arr[i][j]+" | ");
		}
		System.out.println();
		System.out.println("-----------------");
	
	}

}
}
