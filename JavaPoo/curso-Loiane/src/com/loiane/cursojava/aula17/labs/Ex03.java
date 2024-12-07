package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		String name;//biggest than 3 characters
		int age = 0;// between 0 and 150
		double salary;//biggest than 0
		String gender; //male or female
		String statusMarital;//single, married, widower, divorced
		Scanner scan = new Scanner(System.in);
		boolean infoValid = false;
		do {
			System.out.print("Enter a name: ");
			name = scan.next();			
			if(name.length() > 3) {
				infoValid = true;
			}
		}while(!infoValid);
		infoValid = false;
		do {
			System.out.print("Enter an age: ");
			age = scan.nextInt();
			if(age >= 0 && age <= 150) {
				infoValid = true;
			}
		} while(!infoValid);
		infoValid = false;		
		do {
			System.out.print("Enter a salary: ");
			salary = scan.nextDouble();
			if(salary > 0) {
				infoValid = true;
			}
		}while(!infoValid);
		infoValid = false;	
		do {
			System.out.print("Enter a gender: ");
			gender = scan.next();
			switch(gender) {
			case "m":
			case "M": System.out.print("Male\n"); 
					  infoValid = true;
					  break;
			case "f":
			case "F": System.out.print("Female\n"); 
					  infoValid = true;
					  break;
			default:  System.out.println("Gender not valid.\n");					  
			}
		}while(!infoValid);
		infoValid = false;
		do {
			System.out.print("Inform a marital status: ");
			statusMarital = scan.next();
			switch(statusMarital) {
			case "s":
			case "S": System.out.print("Single\n"); 
					  infoValid = true;
					  break;
			case "m":
			case "M": System.out.print("Married\n"); 
					  infoValid = true;
					  break;
			case "w":
			case "W": System.out.print("Widower\n"); 
					  infoValid = true;
					  break;
			case "d":
			case "D": System.out.print("Divorced\n"); 
					  infoValid = true;
					  break;
			default:  System.out.println("Marital status not valid.\n");	
			}
		} while(!infoValid);

		scan.close();
		
	}

}
