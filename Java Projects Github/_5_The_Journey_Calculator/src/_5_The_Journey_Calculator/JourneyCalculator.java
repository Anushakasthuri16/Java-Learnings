package _5_The_Journey_Calculator;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		
		
		System.out.println("Enter speed and time: ");
		Scanner scan = new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		Journycalc jc = new Journycalc();
		double dist=jc.calculateDistance(speed,time);
		System.out.println(dist);
	}
	

			
	}
	


