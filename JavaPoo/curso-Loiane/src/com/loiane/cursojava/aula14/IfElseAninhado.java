package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElseAninhado {

	public static void main(String[] args) {
		double valor;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		valor = scan.nextDouble();
		if(valor <= 10) {
			System.out.println("Está barato, pode comprar");
		} else if(valor > 10 && valor < 15) {
			System.out.println("Valor está aumentando, peça desconto!");
		} else if(valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais!");
		} else {
			System.out.println("Muito caro!");
		}
		
		scan.close();
		

	}

}
