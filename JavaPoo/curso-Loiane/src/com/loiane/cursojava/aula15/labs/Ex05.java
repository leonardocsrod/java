package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		nota1 = scan.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota2 = scan.nextFloat();
		media = (nota1 + nota2) / 2;
		scan.close();
		if(media == 10) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado com louvor");
		} else if(media >= 7) {
			System.out.println("Média: " + media);
			System.out.println("Aprovado");			
		} else {
			System.out.println("Média: " + media);
			System.out.println("Reprovado");
		}

	}

}
