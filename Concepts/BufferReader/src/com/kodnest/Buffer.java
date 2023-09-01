package com.kodnest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter age: ");
				InputStreamReader isr =new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				int n = Integer.parseInt(br.readLine());
				System.out.println(n);
				

	}

}
