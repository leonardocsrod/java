package com.loiane.cursojava.aula18;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial number: ");
		int number = scan.nextInt();
		System.out.println("Enter the final number: ");
		int maximum = scan.nextInt();
		for(int i = number; i <=  maximum; i++) {
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("i: " + i);
		}
		System.out.println("The end!");
		scan.close();



	}

}
