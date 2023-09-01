package data.conversion;

import java.util.Scanner;

public class methodOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a =scan.nextInt();
		System.out.println("Enter b: ");
		int b =scan.nextInt();
		add();
		int c=sub(a,b);
		System.out.println("Subtraction of x and y is: "+c);
		}
	public static void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x: ");
		int x =scan.nextInt();
		System.out.println("Enter y: ");
		int y =scan.nextInt();
		System.out.println("addition of x and y is: "+(x+y));
	}
	public static int sub(int a,int b)
	{
		
		return a-b;
}
}
