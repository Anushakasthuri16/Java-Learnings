package com.kodnest.training.java;

public class typecasting {
	public static void main(String[] args) {
		char a = 'w';
		byte b = 127;
		short c = 32456;
		int d= 27456778;
		long e = 923456788996L;
		float f = 3.14f;
		double g = 23.45678929;
		boolean h = true;
		byte a1 = (byte) c;
		System.out.println("a1 is" +a1);
		byte b1 = (byte) d;
		System.out.println("b1 is" +b1);
		int c1 = (int) e;
		System.out.println("c1 is " +c1);
		int d1 = (int)f;
		System.out.println("d1 is " +d1);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
