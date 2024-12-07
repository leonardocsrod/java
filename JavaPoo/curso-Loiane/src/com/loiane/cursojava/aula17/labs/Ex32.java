package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter = "y";
		int code = 0;
		int quantity = 0;
		double price = 0;
		double sumPrice = 0;
		while(letter.equalsIgnoreCase("y")){
			System.out.print("Enter the code: ");
			code = scan.nextInt();
			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();
			switch(code) {
			case 100: price = 1.2; break;
			case 101: price = 1.3; break;
			case 102: price = 1.5; break;
			case 103: price = 1.2; break;
			case 104: price = 1.3; break;
			case 105: price = 1.0; break;
			default: System.out.println("Price not valid");
			}
			sumPrice += (price * quantity);
			System.out.println("Item: " + code + "\tPrice: " + price + "\tQuantity: " + quantity + "\tTotal: " + (price * quantity));
			System.out.print("Continue[y/n]: " );
			letter = scan.next();	
			scan.close();
		}				
		System.out.println("Total: " + sumPrice);

	}

}
