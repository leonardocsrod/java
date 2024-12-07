package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letter = "";
		int count = 0;		
		double sumProcuts = 0;
		System.out.print("New purchase[y/n]: ");
		letter = scan.next();
		double change = 0;
		double payedCash = 0;
		while(letter.equalsIgnoreCase("y")) {
			System.out.print("Number of products bought: ");
			int numberProducts = scan.nextInt();
			System.out.println("LOJAS TABAJARA");
			count = 0;
			sumProcuts = 0;
			while(count < numberProducts) {
				
				System.out.print("Product " + (count + 1) + ": R$ ");
				sumProcuts += scan.nextDouble(); 	
				count++;
			}
			System.out.print("Total: R$ " + sumProcuts + "\n");
			System.out.print("Dinheiro: R$ ");
			payedCash = scan.nextDouble();
			change = payedCash - sumProcuts;
			System.out.println("Change: R$ " + change);
			System.out.print("New purchase[y/n]: ");
			letter = scan.next();
			if(letter.equalsIgnoreCase("y")) {
				
			}
		}
		
		scan.close();

	}

}
