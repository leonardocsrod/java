package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of grades: ");
		int numberGrades = scan.nextInt();
		float grades = 0;
		float average = 0;
		int count = 1;
		while(count <= numberGrades) {
			System.out.print("Enter the grade: ");
			grades += scan.nextFloat();
			count++;
		}
		average = grades / numberGrades;
		System.out.println("The average of grade is " + average);
		scan.close();

	}

}
