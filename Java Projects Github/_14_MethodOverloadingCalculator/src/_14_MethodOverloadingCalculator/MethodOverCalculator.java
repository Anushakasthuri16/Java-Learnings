package _14_MethodOverloadingCalculator;

import java.util.Scanner;

public class MethodOverCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first: ");
		double first=scan.nextInt();
		System.out.println("Enter operator: ");
		String op=scan.next();
		System.out.println("Enter second: ");
		double second=scan.nextInt();


		switch(op)
		{
		case "+":
			
			double add=Calculator.calculate(first, second);
			System.out.println("Addition of first & second is: "+add);
			break;
		case "-":
			
			double sub=Calculator.calculate(first,second,op);
			System.out.println("Subtraction of first & second is: "+sub);
			break;
		case "*":
			double mul=Calculator.calculate(first,op,second);
			System.out.println("Multiplication of first & second is: "+mul);
			break;
		case "/":
			double div=Calculator.calculate(op,first,second);
			System.out.println("Division of first & second is: "+div);

	}

}
}
