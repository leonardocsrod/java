package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//char letra;
		String letra;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		//letra = scan.next().charAt(0);
		letra = scan.next();
		//if(letra == 'a' || letra == 'A' ||  letra == 'e' ||  letra == 'E' ||  letra == 'i' ||  letra == 'I' ||  letra == 'o' ||  letra == 'O' ||  letra == 'u' ||  letra == 'U') {
		//	System.out.printf("A letra %c é uma vogal. ", letra);
		//	} else {
		//		System.out.printf("A letra %c é uma consoante.", letra);
		//	}
		if(letra.length() > 1) {
			System.out.println("Voce digitou mais de uma letra.");
			System.out.print("Digite uma letra: ");
			letra = scan.next();
		 		
		
		} else {
			switch(letra) {
				case "a":
				case "A":
				case "e":
				case "E":
				case "i":
				case "I":
				case "o":
				case "O":
				case "u":
				case "U": System.out.printf("A letra %s é uma vogal.", letra); break;
				 default: System.out.printf("A letra %s é uma consoante.", letra);						
		}
			
		}
		scan.close();


	}

}
