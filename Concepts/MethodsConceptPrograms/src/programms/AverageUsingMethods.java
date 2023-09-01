package programms;

import java.util.Scanner;

public class AverageUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a= scan.nextInt();
		System.out.println("Enter b value: ");
		int b= scan.nextInt();
		System.out.println("Enter c value: ");
		int c= scan.nextInt();
		System.out.println("Enter d value: ");
		int d= scan.nextInt();
		
		addAvg(a,b,c,d);
		
		int res=addAvg1(a,b,c,d);
		System.out.println("Avg of result using method 4 "+res);

	}
	public static void addAvg(int a,int b,int c, int d) 
	{
	int temp= (a+b+c+d)/4;
	System.out.println("Avg of result using method 3 "+temp);
	}
	public static int addAvg1(int a,int b,int c, int d) 
	{
		return (a+b+c+d)/4;
	}


	}


