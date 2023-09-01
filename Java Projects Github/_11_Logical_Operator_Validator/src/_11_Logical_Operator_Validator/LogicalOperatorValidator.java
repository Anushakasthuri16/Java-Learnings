package _11_Logical_Operator_Validator;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Is input valid (true/false): ");
boolean input=scan.nextBoolean();
System.out.println("Does input meet a certain condition (true/false): ");
boolean condition=scan.nextBoolean();
Registration res=new Registration();
res.ValidInput(input, condition);

	}

}
