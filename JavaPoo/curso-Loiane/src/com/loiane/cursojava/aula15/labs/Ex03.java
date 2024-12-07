package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//char escolha;
		String escolha;
		Scanner scan = new Scanner(System.in);
		System.out.print("Escolha o gênero[m/f]: ");
		//escolha  = scan.next().charAt(0);
		escolha = scan.next();
		if(escolha.equalsIgnoreCase("m")) {
			System.out.println("O gênero é masculino!");
		} else if(escolha.equalsIgnoreCase("f")) {
			System.out.println("O gênero é feminino!");
		} else {
			System.out.println("A escolha não é válida!");
		}
		
		scan.close();

	}

}
