package _35_Amstrong_Number;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.err.println("Enter number: ");
int a=scan.nextInt();
Amstrong ams=new Amstrong();
int power=ams.amsnum(a);
if (a==power)
{
	System.out.println("Amstrong");
}
else
{
	System.out.println("Not an Amstrong");
}
	}

}
