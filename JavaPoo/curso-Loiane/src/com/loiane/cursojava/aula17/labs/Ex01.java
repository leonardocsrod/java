package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		boolean validGrade = false;
		do {
			System.out.print("Enter a grade: ");
			double grade = scan.nextDouble();
			if(grade >= 0 && grade <= 10) {
				validGrade = true;
				System.out.println("The note is " + grade);
			} else {
				System.out.println("The note is not valid. Enter a grade again.");
			}
		} while(!validGrade);
		scan.close();

	}

}
