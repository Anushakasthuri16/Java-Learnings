package _9_Temperature_Conversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Temperature conversion tool");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to celsius");
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int con=scan.nextInt();
		if (con==1)
		{
			System.out.println("Enter temperature in celsius: ");
			double celsius=scan.nextDouble();
			double c= celsiusToFahrenheit(celsius);
			System.out.println(celsius+ " is eqvivalent to " +c);
		}
		
		else if (con==2)
		{
			System.out.println("Enter temperature in Fahrenheit: ");
			double fahrenheit=scan.nextDouble();
			double f= fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+" is eqvivalent to "+f);
		}
	}
	
	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius* 9/5) + 32;
		}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit - 32)*5/9;
	}
}
