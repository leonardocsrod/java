package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of the classes: ");
		int numberClasses = scan.nextInt();
		int count = 0;
		float averageStudent = 0;
		int sumStudent = 0;
		while(count < numberClasses) {
			System.out.print("Enter the number of students of the class " + (count + 1) + ": " );
			sumStudent += scan.nextInt();
			count++;
		}
		averageStudent = sumStudent / numberClasses;
		System.out.println("The student average is " + averageStudent);
		scan.close();

	}

}
