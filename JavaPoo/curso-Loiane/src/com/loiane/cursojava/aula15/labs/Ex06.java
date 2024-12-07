package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int numero1, numero2, numero3;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = scan.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = scan.nextInt();
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O número " + numero1 + " é o maior número.");
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O número " + numero2 + " é o maior número.");
		} else {
			System.out.println("O número " + numero3 + " é o maior número.");
		}
		
		
		scan.close();

	}

}
