package UserInput;

import java.util.Scanner;

public class Array1DUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter array length");
int arr[]=new int[scan.nextInt()];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("Enter values in array: ");
	arr[i]=scan.nextInt();
	}
System.out.println("The Array Contents Are....");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]+" | ");
}
	}

}
