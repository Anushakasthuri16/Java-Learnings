package _8_The_Calculator_Dilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int first= scan.nextInt();
		System.out.println("Enter any Arithmetic Operator");
		String operator= scan.next();
		System.out.println("Enter Second number: ");
		int second= scan.nextInt();
		calculator(first,operator,second);
		
		
	}
	public static void calculator(int first,String operator,int second)
	{
		
		switch(operator)
		{
		case "+":
			int add=first+second;
			System.out.println("Addition of first & second is: "+add);
			break;
		case "-":
			int sub=first-second;
			System.out.println("Subtraction of first & second is: "+sub);
			break;
		case "*":
			int mul=first*second;
			System.out.println("Multiplication of first & second is: "+mul);
			break;
		case "/":
			int div=first/second;
			System.out.println("Division of first & second is: "+div);
			break;
		case "%":
			int mod=first%second;
			System.out.println("Modulus of first & second is: "+mod);
			break;
		
		}
		
	}

}
