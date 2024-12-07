package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int numberFactorial = scan.nextInt();
		int multiplier = 1;
		int count = 1;
		while(count <= numberFactorial) {
			multiplier = (multiplier) * count;
			count++;
		}
		System.out.println("Factorial " + numberFactorial + "!: " + multiplier);
		scan.close();

	}

}
