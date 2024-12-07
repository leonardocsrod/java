package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float preco1, preco2, preco3;
		System.out.print("Informe o preço do produto 1: ");
		preco1 = scan.nextFloat();
		System.out.print("Informe o preço do produto 2: ");
		preco2 = scan.nextFloat();
		System.out.print("Informe o preço do produto 3: ");
		preco3 = scan.nextFloat();
		scan.close();
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("O preço do produto 1 (R$ " + preco1 + ") é o mais barato."); 
		} else if(preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("O preço do produto 2 (R$ " + preco2 + ") é o mais barato.");
		} else {
			System.out.println("O preço do produto 3 (R$ " + preco3 + ") é o mais barato.")  ;
		}
	}

}
