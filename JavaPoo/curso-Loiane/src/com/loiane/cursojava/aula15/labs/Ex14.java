package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String concept = "A";
		double grade1, grade2, average;
		System.out.print("Enter the first grade: ");
		grade1 = scan.nextDouble();
		System.out.print("Enter the second grade: ");
		grade2 = scan.nextDouble();
		average = (grade1 + grade2) / 2;
		if(average >= 0 && average < 4) {
			concept = "E";	
		} else if(average >= 4 && average < 6) {
			concept = "D";
		} else if(average >= 6 && average < 7.5) {
			concept = "C";
		} else if(average >= 7.5 && average < 9) {
			concept = "B";	
		} else if(average >= 9 && average < 10) {
			concept = "A";
		}
		System.out.println("The average is " + average + " and the concept is " + concept + ".");
		System.out.print("The situation is ");
		switch(concept) {
		case "A": 
		case "B":
		case "C": System.out.println("Approved"); break;
		case "D":
		case "E": System.out.println("Failed"); break;
			
		}
		
		
		scan.close();

	}

}
