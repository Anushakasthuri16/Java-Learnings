package _6_Temperature_Converter;

import java.util.Scanner;

public class TemperaturConvertorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature: ");
		double fahrenheit= scan.nextDouble();
		TemperatureConvertor tc = new TemperatureConvertor();
		double temperature=tc.convertFahrenheitToCelsius(fahrenheit);
		
System.out.println(temperature);
	}

}
