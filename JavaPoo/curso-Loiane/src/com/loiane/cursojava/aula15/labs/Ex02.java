package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número[+/-]: ");
		numero = scan.nextInt();
		if(numero > 0) {
			System.out.println("O número é positivo.");
		} else if(numero == 0) {
			System.out.print("O número é neutro(zero).");
		} else {
			System.out.println("O número é negativo.");
		}
		
		scan.close();

	}

}
