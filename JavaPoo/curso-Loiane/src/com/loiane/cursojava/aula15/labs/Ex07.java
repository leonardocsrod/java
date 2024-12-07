package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.print("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = scan.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = scan.nextInt();
		scan.close();
		if(numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O número " + numero1 + " é o maior número.");
		} else if(numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("O número " + numero2 + " é o maior número.");
		} else {
			System.out.println("O número " + numero3 + " é o maior número.");
		}
		if(numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("O número " + numero1 + " é o menor número.");
		} else if(numero2 <= numero1 && numero2 <= numero3) {
			System.out.println("O número " + numero2 + " é o menor número.");
		} else {
			System.out.println("O número " + numero3 + " é o menor número.");
		}
		
	}

}
