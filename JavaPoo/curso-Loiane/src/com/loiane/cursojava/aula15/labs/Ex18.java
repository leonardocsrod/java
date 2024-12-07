package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a numer: ");
		int number = scan.nextInt();
		scan.close();
		if(number % 2 == 0) {
			System.out.println("the number is pair.");
		} else {
			System.out.println("the number is odd.");
		}

	}

}
