package programms;

import java.util.Scanner;

public class ArithemeticINmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(subtractNumbers( num1, num2));
		System.out.println("Enter: ");
		int num3=scan.nextInt();
		int num4=scan.nextInt();
		System.out.println(multiplyNumbers( num3, num4));
		System.out.println("Enter: ");
		int num5=scan.nextInt();
		int num6=scan.nextInt();
		System.out.println(divideNumbers( num5, num6));
		System.out.println("Enter: ");
		int num7=scan.nextInt();
		int num8=scan.nextInt();
		System.out.println(findRemainder( num7, num8));
		
		
	}
	public static int subtractNumbers(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1,int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1,int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2)
	{
		return num1%num2;
	}
	}

