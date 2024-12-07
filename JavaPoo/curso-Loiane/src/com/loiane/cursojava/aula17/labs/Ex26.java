package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scan.nextInt();
		int count = 1;
		int factorial = 1;
		while(count <= number) {
			factorial *= count;
			count++;
		}
		System.out.println("Factorial " + number + "!: " + factorial);
		scan.close();

	}

}
