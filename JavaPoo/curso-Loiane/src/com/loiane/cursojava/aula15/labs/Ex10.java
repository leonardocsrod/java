package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String letra;
		System.out.print("Informe o turno que você estuda[m, v, n]: ");
		letra = scan.next();
		switch(letra) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Resposta inválida!"); 
		}
			
		scan.close();

	}

}
