package _35_Power_Of_Digits;

import java.util.Scanner;

public class PowerOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		Power p=new Power();
		int digi=p.CountNumber(num);
		int res=p.raiseToPowerN(num,digi);
		System.out.println(res);
	}

}
