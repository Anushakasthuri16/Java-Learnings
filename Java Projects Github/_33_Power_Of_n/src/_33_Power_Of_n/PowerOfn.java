package _33_Power_Of_n;

import java.util.Scanner;

public class PowerOfn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scan.nextInt();
		int range=scan.nextInt();
		PowerN pn=new PowerN();
		int res=pn.raiseToPowerN(num, range);
		System.out.println(res);
	}

}
