package UserInput;

import java.util.Scanner;

public class Array3DUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter schools,class,students length");
int arr[][][]=new int[scan.nextInt()][scan.nextInt()][scan.nextInt()];

for (int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		for (int k=0;k<=arr[i][j].length-1;k++)
		{
		System.out.println("Enter "+i+ " school "+j+ " class " +k+ " student ");	
		arr[i][j][k]=scan.nextInt();
		}
	}
}
System.out.println("Array contents are....");
for (int i=0;i<=arr.length-1;i++)
{
	System.out.println("--------------------");
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.print("| ");
		for (int k=0;k<=arr[i][j].length-1;k++)
		{
		System.out.print(arr[i][j][k]+" | ");
		}
		System.out.println();
		}
	
	System.out.println();
}
	}

}
