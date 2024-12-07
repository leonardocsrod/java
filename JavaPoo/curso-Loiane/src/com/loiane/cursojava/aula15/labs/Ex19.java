package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int number1 = scan.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = scan.nextInt();
		System.out.print("Enter the math operation[+ - * /]: ");
		String operation = scan.next();
		scan.close();
		double result = 0;
		boolean valid = true;
		switch(operation) {
		case "+": 	result = number1 + number2;
					break;
		case "-": 	result = number1 - number2;
					break;
		case "*": 	result = number1 * number2;
					break;
		case "/": 	result = number1 / number2;
					break;
		default: 	System.out.println("The operation is invalid.");
					valid = false;
		}
		if(valid) {
			System.out.println("The result of the operation " + operation + " is " + result);
			if(result >=0 ) {
				System.out.println("The result is positive.");
			} else {
				System.out.println("The result is negative.");
			}
			if(result % 2 == 0) {
				System.out.println("The result is pair.");
			} else {
				System.out.println("The result is odd.");
			}
			
		}
		
	}

}
