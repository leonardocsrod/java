package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the price of the bread:  ");
		double unitPrice = scan.nextDouble();
		int count = 1;
		double totalPrice = 0;
		while(count <= 50) {
			totalPrice = count * unitPrice;
			System.out.println(count + " R$ " + totalPrice);
			count++;
		}
		scan.close();

	}

}
