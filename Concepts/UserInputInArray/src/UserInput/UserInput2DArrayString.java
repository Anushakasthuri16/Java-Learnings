package UserInput;

import java.util.Scanner;

public class UserInput2DArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("Enter");
Scanner scan=new Scanner(System.in);

String arr[][]=new String[scan.nextInt()][scan.nextInt()];

for(int i=0;i<=arr.length-1;i++) 
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		arr[i][j]=scan.next();
	}
}
for(int i=0;i<=arr.length-1;i++) 
{
	for(int j=0;j<=arr[i].length-1;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
}

	}

}
