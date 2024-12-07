package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("+=====PRICE LIST=====+");
		int count = 1;
		double unitPrice = 1.99;
		double totalPrice = 0;
		while(count <= 50) {
			totalPrice = unitPrice * count;
			System.out.println("      " + count + " R$ " + (totalPrice));
			count++;
			System.out.println("+=+=+=+=+=+=+=+=+=+=+=+");
		}
		scan.close();

	}

}
