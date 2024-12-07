package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter = "s";
		int age = 0;
		int count25 = 0;
		int count60 = 0;
		int countAfter60 = 0;
		while(!letter.equalsIgnoreCase("n")) {
			System.out.print("Informe your age: ");
			age = scan.nextInt();
			if(age >=0 && age <= 25) {
				count25++;
			} else if(age >= 25 && age <= 60){
				count60++;
			} else {
				countAfter60++;
			}
			System.out.print("Do you want to continue[y/n]: ");
			letter = scan.next();			
		}
		System.out.println("Result\nUntil 25: " + count25 + "\nBetween 26 and 60: " + count60 + "\nAfter 60: " + countAfter60);
		scan.close();

	}

}
