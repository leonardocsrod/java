package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int horasTrabalhadas, fgts, descontoIRPF, inss;
		double salarioBruto, valorHora, valorIRPF, valorINSS, valorFGTS, totalDescontos, salarioLiquido;
		fgts = 11;
		inss = 10;
		descontoIRPF = 0;
		System.out.print("Horas trabalhadas no mês: ");
		horasTrabalhadas = scan.nextInt();
		System.out.print("Valor da hora trabalhada: ");
		valorHora = scan.nextDouble();
		scan.close();
		salarioBruto = valorHora * horasTrabalhadas;
		if(salarioBruto <= 900) {
			descontoIRPF = 1;
		} else if(salarioBruto <= 1500) {
			descontoIRPF = 5;
		} else if(salarioBruto <= 2500) {
			descontoIRPF = 10;
		} else  {
			descontoIRPF = 20;
		}
		valorINSS = (salarioBruto / 100) * inss;
		valorIRPF = (salarioBruto / 100) * descontoIRPF;
		valorFGTS = (salarioBruto / 100) * fgts;
		totalDescontos = valorIRPF + valorINSS;
		salarioLiquido = salarioBruto - totalDescontos;
		System.out.println("Salário bruto: (" + horasTrabalhadas + " * " + valorHora + ")\t:R$ " + salarioBruto);
		System.out.println("(-) IR (" + descontoIRPF + "%)\t\t\t:R$ "  + valorIRPF);
		System.out.println("(-) INSS (" + fgts + "%)\t\t\t:R$ "  + valorINSS);
		System.out.println("FGTS (" + fgts + "%)\t\t\t:R$ "  + valorFGTS);	
		System.out.println("Total de descontos: \t\t:R$ "  + totalDescontos);
		System.out.println("Salario Líquido: \t\t:R$ "  + salarioLiquido);	

	}

}
