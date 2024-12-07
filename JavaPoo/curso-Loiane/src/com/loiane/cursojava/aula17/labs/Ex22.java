package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount of CDs: ");
		int numberOfCDs = scan.nextInt();
		float sumPrices = 0;
		float averagePrice = 0;
		int count = 0;
		while(count < numberOfCDs) {
			System.out.print("Enter the price of CD " + (count + 1) + ": ");
			sumPrices += scan.nextFloat(); 
			count++;			
		}
		averagePrice = sumPrices / numberOfCDs;
		System.out.println("The sum of price is R$" + sumPrices + ".\nThe price average of the CD is R$ " + averagePrice);
		scan.close();

	}

}
