package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the day of the week[1-7]: ");
		int day = scan.nextInt();
		scan.close();
		switch(day) {
		case 1: System.out.println("Sunday"); break;
		case 2: System.out.println("Monday"); break;
		case 3: System.out.println("Tuesday"); break;
		case 4: System.out.println("Wednesday"); break;
		case 5: System.out.println("Thursday"); break;
		case 6: System.out.println("Friday"); break;
		case 7: System.out.println("Saturday"); break;
		default: System.out.println("The number is not valid");
		}
	}
}
