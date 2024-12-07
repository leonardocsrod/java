package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String choose = "x";
		double liters = 0;		
		double precoAlcool = 1.9;
		double precoGasolina = 2.5;		
		System.out.print("What fuel do you use? ");
		choose = scan.next();
		if(choose.equalsIgnoreCase("a")) {
			System.out.println("You use alcohol.");
			System.out.print("How many liters? ");
			liters = scan.nextDouble();
			double totalPrice = precoAlcool * liters;	
			if(liters <= 20) {
				totalPrice *= 0.97;				
			} else {
				totalPrice *= 0.95;
			}
			System.out.println("The total price is " + totalPrice);
		}
		if(choose.equalsIgnoreCase("g")){
			System.out.println("You use gasoline.");
			System.out.print("How many liters? ");
			liters = scan.nextDouble();
			double totalPrice = precoGasolina * liters;
			if(liters <= 20) {
				totalPrice *= 0.96;
			} else {
				totalPrice *= 0.94;
			}
			System.out.println("The total price is " + totalPrice);
		}
				
		
		scan.close();

	}

}
