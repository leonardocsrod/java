package com.loiane.cursojava.aula17.labs;

public class Ex04 {

	public static void main(String[] args) {
		int year = 0;
		int populationA = 80000;
		int populationB = 200000;
		while(populationA <= populationB) {
			System.out.print("Year = " + year + "\t");
			System.out.print("Population A = " + populationA + "\t" );
			System.out.print("Population B = " + populationB + "\n" );
			populationA *= 1.03;
			populationB *= 1.015;			
			year++;			
		}
		System.out.println("It will take " + (year + 1) + " years to population A supass population B.");
		

	}

}
