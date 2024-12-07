package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int base, power;
		
		int count = 1;
		System.out.print("Enter the base: ");
		base = scan.nextInt();		
		System.out.print("Enter the power: ");
		power = scan.nextInt();
		int result = base;
		while(count < power) {
			result *= base;
			count++;
		}
		System.out.println("The result between " + base + " and " + power + " is " + result);
		scan.close();
		

	}

}
