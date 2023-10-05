package UserInput;

import java.util.Scanner;

public class Array3DJaggedUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter 1D array length");
int arr[][][]=new int[scan.nextInt()][][];

for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("Enter 1D of 2D array"+i);
	arr[i]=new int[scan.nextInt()][];
	
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.println("Enter 2D array");
		arr[i][j]=new int[scan.nextInt()];
	}
}

for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		for(int k=0;k<=arr[i][j].length-1;k++)
		{
			System.out.println("Enter "+i+" student "+j+" class "+k+" student");
			arr[i][j][k]=scan.nextInt();
		}
	}
}
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		for(int k=0;k<=arr[i][j].length-1;k++)
		{
			System.out.print(arr[i][j][k]+" | ");
		}
		System.out.println();
	}
	System.out.println();
}
	}

}
