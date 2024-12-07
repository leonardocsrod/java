package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial number: ");
		int number = scan.nextInt();
		System.out.println("Enter the final number: ");
		int maximum = scan.nextInt();
		for(int i = number; i <=  maximum; i++) {
			System.out.println("Number: " + i);
			if(i % 7 == 0) {
				System.out.println("The number is divisible for 7: ");
				break;
			}
		}
		System.out.println("The end!");
		scan.close();

	}

}
