package _10__Tax_Calculator;

import java.util.Scanner;

public class TaxInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter purchase amount: ");
double Purchase_Amount=scan.nextDouble();
System.out.println("Enter tax rate: ");
double tax_rate=scan.nextDouble();
double total=calculateTotalWithTax(Purchase_Amount,tax_rate);
System.out.println("Total cost including tax: "+total);

}
public static double calculateTotalWithTax(double Purchase_Amount,double tax_rate)
{
	double tax=Purchase_Amount*tax_rate;
	return Purchase_Amount+tax;
}
}
