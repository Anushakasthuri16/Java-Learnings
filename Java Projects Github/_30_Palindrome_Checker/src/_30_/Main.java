package _30_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		subclass sc=new subclass();
		System.out.println(sc.Palindrome(n));
	}

}
