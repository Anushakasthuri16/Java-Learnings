package _31_Power_Of_Two;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		PowerChecker pc=new PowerChecker();
		pc.PowerCheck(n);
		
		
	}

}
