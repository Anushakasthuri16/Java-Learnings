package programms;

import java.util.Scanner;

public class GreetWithAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String a = scan.nextLine();
		System.out.println("Enter your age: ");
		int b =scan.nextInt();
		greet(a);
		int c=age(b);
		System.out.println("Your age is "+c);
		scan.close();
	}
public static void greet(String a)
{
	System.out.println("Hello " +a+ "...  How are you..?");
}
public static int age(int b)
{
	return b;
}
	}


