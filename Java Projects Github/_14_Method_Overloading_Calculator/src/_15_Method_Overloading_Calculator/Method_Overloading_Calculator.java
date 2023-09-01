package _15_Method_Overloading_Calculator;

import java.util.Scanner;

public class Method_Overloading_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter first: ");
int first=scan.nextInt();
System.out.println("Enter operator: ");
String op=scan.next();
System.out.println("Enter second: ");
int second=scan.nextInt();


switch(op)
{
case "+":
	
	int add=calculator.calculate(first, second);
	System.out.println("Addition of first & second is: "+add);
	break;
case "-":
	
	int sub=calculator.calculate(first,second,op);
	System.out.println("Subtraction of first & second is: "+sub);
	break;
case "*":
	int mul=calculator.calculate(first,op,second);
	System.out.println("Multiplication of first & second is: "+mul);
	break;
case "/":
	int div=calculator.calculate(op,first,second);
	System.out.println("Division of first & second is: "+div);
	break;
}

}
}
