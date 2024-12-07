package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choose = "a";
		String method = "a";
		double kilo = 0;
		double priceFile = 0;
		double totalPriceFile = 0;
		double creditCardDiscount = 5;
		//choice of meat
		System.out.print("Choose the meat[f/a/p]: ");
		choose = scan.next();
		if(choose.equalsIgnoreCase("f")) {			
			System.out.print("How many kilos do you want: ");
			kilo = scan.nextDouble();
			if(kilo <= 5) {
				priceFile = 4.9;
			} else {
				priceFile = 5.8;
			}
			totalPriceFile = kilo * priceFile;
			System.out.println("++++++++++File++++++++++");
			System.out.println("Weight(kg): \t" + kilo + "\nTotal(R$): \t" + totalPriceFile);
		} else if(choose.equalsIgnoreCase("a")) {			
			System.out.print("How many kilos do you want: ");
			kilo = scan.nextDouble();
			if(kilo <= 5) {
				priceFile = 5.9;
			} else {
				priceFile = 6.8;
			}
			totalPriceFile = kilo * priceFile;
			System.out.println("++++++++++Alcatra++++++++++");
			System.out.println("Weight(kg): \t" + kilo + "\nTotal(R$): \t" + totalPriceFile);
		} else if(choose.equalsIgnoreCase("p")) {			
			System.out.print("How many kilos do you want: ");
			kilo = scan.nextDouble();
			if(kilo <= 5) {
				priceFile = 6.9;
			} else {
				priceFile = 7.8;
			}
			totalPriceFile = kilo * priceFile;
			System.out.println("++++++++++Picanha++++++++++");
			System.out.println("Weight(kg): \t" + kilo + "\nTotal(R$): \t" + totalPriceFile);
		}
		System.out.print("Payment method[cash(c)/credit card(cc)]: ");
		method = scan.next();
		if(method.equalsIgnoreCase("c")) {
			System.out.println("Cash payment");
			System.out.println("No discount - Total: " + totalPriceFile);
		} else if(method.equalsIgnoreCase("cc")) {
			System.out.println("Credit Card payment");
			totalPriceFile *= 0.95;
			System.out.println("Discount " + creditCardDiscount + "%\nTotal: R$ " + totalPriceFile);
		} 
		scan.close();
	}

}
