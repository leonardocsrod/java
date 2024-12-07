package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int numero1, numero2, numero3, maior, menor, meio;
		System.out.print("Digite o primeiro número: ");
		numero1 = scan.nextInt();
		maior = menor = meio = numero1;
		System.out.print("Digite o segundo número: ");
		numero2 = scan.nextInt();
		if(numero2 > numero1) {
			maior = numero2;
		}
		if(numero2 < numero1) {
			menor = numero2;
		}
		System.out.print("Digite o terceiro número: ");
		numero3 = scan.nextInt();
		if(numero3 > maior) {
			meio = maior;
			maior = numero3;
		}
		if(numero3 < menor) {
			meio = menor;
			menor = numero3;
		}
		System.out.println("Número 1 = " + numero1 + "\nNúmero 2 = " + numero2 + "\nNúmero 3 = " 
		+ numero3 + "\nMaior = " + maior + "\nMeio = " + meio + "\nMenor = " + menor);
		
		scan.close();

	}

}
