package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		int terms = 0;
		int count = 1;
		int numerator = 1;
		int denominator = 1;
		double result = 0;
		double sumResult = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many terms: ");
		terms = scan.nextInt();
		System.out.print("H = ");
		while(count <= terms) {
			if(count == 1) {
				System.out.print(numerator + " +  ");
			} else if(count < terms) {
				System.out.print(numerator + "/" + denominator + " + ");
			} else {
				System.out.print(numerator + "/" + denominator );
			}	
			result = numerator / denominator;
			sumResult += result;
			denominator++;
			count++;
		}
		System.out.println("\nThe sum of the terms is " + sumResult);
		
		scan.close();

	}

}
