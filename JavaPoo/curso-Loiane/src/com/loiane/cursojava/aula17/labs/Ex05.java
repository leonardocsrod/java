package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int populationA, populationB;	
		double taxA, taxB;
		int year = 0;				
		//validate the population A
		boolean validInfo = false;
		do {
			System.out.print("Enter the population A: ");
			populationA = scan.nextInt();
			if(populationA > 0) {
				System.out.println("\nThe population A is " + populationA + "\n");
				validInfo = true;
			} else {
				System.out.println("\nThe population must be bigger than 0.\n");
			}
		} while(!validInfo);
		//validate the population B
		validInfo = false;
		do {
			System.out.print("\nEnter the population B: ");
			populationB = scan.nextInt();
			if(populationB > 0) {
				System.out.println("\nThe population B is " + populationB + "\n");
				validInfo = true;
			} else {
				System.out.println("\nThe population must be bigger than 0.");
			}
		} while(!validInfo);
		//validate the tax increase of population A
		validInfo = false;
		do {
			System.out.print("Enter the increase tax of population A: ");
			taxA = scan.nextDouble();
			if(taxA > 0) {
				System.out.println("\nThe increase tax of population A is " + taxA + "%\n");
				validInfo = true;
			} else {
				System.out.println("\nThe increase tax must be bigger than 0.\n");
			}
		} while(!validInfo);
		//validate the tax increase of population B
		validInfo = false;
		do {
			System.out.print("Enter the increase tax of population B: ");
			taxB = scan.nextDouble();
			if(taxB > 0) {
				System.out.println("\nThe increase tax of population B is " + taxB + "%\n");
				validInfo = true;
			} else {
				System.out.println("\nThe increase tax must be bigger than 0.\n");
			}
		} while(!validInfo);
		
		while(populationA <= populationB) {
			System.out.print("Year = " + year + "\t");
			System.out.print("Population A = " + populationA + "\t" );
			System.out.print("Population B = " + populationB + "\n" );
			populationA *= ((taxA / 100) + 1);
			populationB *= ((taxB / 100) + 1);
				
			year++;
		}

		scan.close();
		System.out.println("It will take " + (year) + " years to population A supass population B.");
		

	}

}
