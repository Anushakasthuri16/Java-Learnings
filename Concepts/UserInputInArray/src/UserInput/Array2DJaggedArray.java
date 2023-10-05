package UserInput;

import java.util.Scanner;

public class Array2DJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter row and col length: ");
		int arr[][]=new int[scan.nextInt()][scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println("Enter "+i+ "-row "+j+ "-col ");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array contents are.....");
		System.out.println("---------------------");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("| ");
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
			System.out.println("---------------------");
		}
	}

}
