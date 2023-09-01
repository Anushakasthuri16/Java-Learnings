package _32_Count_Of_Number;

import java.util.Scanner;

public class CountTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		Count c=new Count();
		c.CountNumber(n);
	}

}
