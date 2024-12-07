package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double kiloStraw = 0;
		double kiloApple = 0;
		double kiloTotal = 0;
		double precoFruit = 0;
		double totalPriceStraw = 0;
		double totalPriceAp = 0;
		double totalPrice = 0;
		System.out.print("How many kilos of strawberry do you want: ");
		kiloStraw = scan.nextDouble();
		if(kiloStraw <= 5) {
				precoFruit = 2.5;
			} else {
				precoFruit = 2.2;
			}
		totalPriceStraw = kiloStraw * precoFruit;
		System.out.println("The total price of strawberry is " + totalPriceStraw);		
		System.out.print("How many kilos of apple do you want: ");
		kiloApple = scan.nextDouble();
		if(kiloApple <= 5) {
				precoFruit = 1.8;
			} else {
				precoFruit = 1.5;
			}
			totalPriceAp = kiloApple * precoFruit;
			System.out.println("The total price of apple is " + totalPriceAp);
		totalPrice = totalPriceAp + totalPriceStraw;
		kiloTotal = kiloStraw + kiloApple;
		System.out.println("Strawberry: \nKilos: " + kiloStraw + "\tValue: " + totalPriceStraw);
		System.out.println("Apple: \nKilos: " + kiloApple + "\tValue: " + totalPriceAp);
		System.out.println("The total kilo is " + kiloTotal);
		System.out.println("The total price is " + totalPrice);
		if(totalPrice > 25 || kiloTotal > 8) {
			totalPrice *= 0.9;
			System.out.println("After discount:");
			System.out.println("The total price is " + totalPrice);
		}
		scan.close();

	}

}
