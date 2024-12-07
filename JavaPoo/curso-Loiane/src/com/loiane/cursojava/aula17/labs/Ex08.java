package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		int count = 1;
		int sum = 0;
		double average = 0;
		while(count <= 5) {
			System.out.print("Enter the number " + count + ": ");
			number = scan.nextInt();
			sum += number;
			count++;
		}
		average = sum / (count - 1);
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The average of the number is " + average);
		
		scan.close();

	}

}
