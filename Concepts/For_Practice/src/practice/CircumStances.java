package practice;

import java.util.Scanner;

public class CircumStances {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius=scan.nextDouble();
		double pie=3.141;
		circumcircle cs=new circumcircle();
		System.out.println(cs.ciscir(pie,radius));

	}

}
