package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero1, numero2;
		System.out.print("Digite o primeiro número: ");
		numero1 = scan.nextInt();		
		System.out.print("Digite o segundo número: ");
		numero2 = scan.nextInt();
		if(numero1 > numero2) {
			System.out.print("O número 1 é maior: " + numero1);
		} else {
			System.out.print("O número 2 é maior: " + numero2);		
			
		}
		scan.close();

	}

}
