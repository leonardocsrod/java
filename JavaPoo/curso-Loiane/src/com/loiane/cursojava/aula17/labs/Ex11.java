package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		int number1, number2;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter the number 1: ");
			number1 = scan.nextInt();
			System.out.print("Enter the number 2: ");
			number2 = scan.nextInt();
			while(number1 < (number2 - 1)) {
				number1++;
				System.out.println("Number: " + number1);
				sum += number1;
			}
			System.out.println("The sum of the numbers is " + sum);
			scan.close();

	}

}
