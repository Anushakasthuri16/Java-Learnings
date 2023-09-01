package datatype;

import java.util.Scanner;

public class integer {

	public static void main(String []args) 
	{
		System.out.println("Enter byte: ");
		Scanner scan=new Scanner(System.in);
		byte b=scan.nextByte();
		System.out.println("Enter short: ");
		short s=scan.nextShort();
		System.out.println("Enter int: ");
		int i=scan.nextInt();
		System.out.println("Enter long: ");
		long l=scan.nextLong();
		System.out.println("Given byte is: "+b);
	
		System.out.println("Given byte is: "+s);
		
		System.out.println("Given byte is: "+i);
	
		System.out.println("Given byte is: "+l);

	}

}
