package _20_Vending_Machine_Stimulator;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter: ");
		String code=scan.next();
	
		getProduct(code);
		
	}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01" :
			System.out.println("Cocacola");
			break;
		case "P02" :
			System.out.println("Pepsi");
			break;
		case "P03" :
			System.out.println("Fanta");
			break;
		case "P04" :
			System.out.println("jalJeera");
			break;
		case "P05" :
			System.out.println("Mountian Dew");
			break;
		case "P06" :
			System.out.println("Boat Guava");
			break;
		default:
			System.out.println("Panaka");
		}
	}
}
