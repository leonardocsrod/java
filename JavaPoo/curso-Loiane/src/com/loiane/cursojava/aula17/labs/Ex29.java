package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		scan.close();
		int count = 1;
		int count2 = 1;
		int countPrime = 1;
		while(count <= number) {
			countPrime = 0;
			count2 = 1;
			while(count2 <= count) {
				if(count % count2 == 0) {
					countPrime++;
				}
				count2++;
			}
			if(countPrime == 2) {
				System.out.println("The number " + count + " is prime.");
			}
			count++;
		}
		
	}

}
