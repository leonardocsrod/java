package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double salarioAtual, novoSalario = 0, valorAumento = 0;
		int percentual = 0;
		System.out.print("Informe o salário atual do desenvolvedor: ");
		salarioAtual = scan.nextDouble();
		if(salarioAtual <= 280) {
			percentual = 20;
			
		} else if(salarioAtual < 700) {
			percentual = 15;
			
		} else if(salarioAtual < 1500) {
			percentual = 10;
			
		} else if(salarioAtual >= 1500) {
			percentual = 5;
			
		}
		scan.close();
		novoSalario = ((salarioAtual / 100) * percentual) + salarioAtual;	
		valorAumento = (salarioAtual / 100) * percentual;
		System.out.println("Salario atual: " + salarioAtual);
		System.out.println("Percentual de aumento: " + percentual);
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Novo salário: " + novoSalario);
	}
	

}
