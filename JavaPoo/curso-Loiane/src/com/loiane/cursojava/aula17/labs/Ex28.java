package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = scan.nextInt();
		int count = 1;
		int countPrime = 0;
		while(count <= number) {
			if(number % count == 0) {
				countPrime++;
			}
			count++;
		}
		if(countPrime == 2) {
			System.out.println("The number is prime.");
		} else {
			System.out.println("The number is not prime;");
		}
		scan.close();

	}

}
