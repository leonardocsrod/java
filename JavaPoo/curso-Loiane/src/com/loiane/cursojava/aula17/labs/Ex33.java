package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		int numerator = 1;
		int denominator = 1;
		int term = 0;
		int count = 1;
		double result = 0;
		double sumResult = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Which term: ");
		term = scan.nextInt();
		System.out.print("S = ");
		while(count <= term) {	
			if(count < term) {
				System.out.print(numerator + "/" + denominator + " + ");
			} else {
				System.out.print(numerator + "/" + denominator);
			}
			result = numerator / denominator;
			sumResult += result;
			numerator++;
			denominator += 2;
			count++;
		}
		System.out.println("\nThe sum of the terms is " + sumResult);
		scan.close();

	}

}
