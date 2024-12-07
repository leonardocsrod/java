package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 1995;
		double salary = 1000;
		double adjustment = 1.5;
		int today = 2015;
		while(year <= today) {
			System.out.printf("Year: %d\tSalary: %.2f\tAdjustment: %.2f\n", year , salary, adjustment);
			adjustment *= 2;			
			salary = salary * ((adjustment / 100) + 1);
			year++;
		}
		scan.close();

	}

}
