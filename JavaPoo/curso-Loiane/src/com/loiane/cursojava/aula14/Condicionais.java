package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.print("Entre com a idade: ");
		idade  = scan.nextInt();
		System.out.println("Idade = " + idade);
		if(idade >= 18) {
			System.out.println("É maior de idade!");
		}else {
			System.out.println("Não é maior de idade!");
		}
		scan.close();
	}

}
