import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		// 1. Soma Simples
		//Escreva um programa que recebe dois números inteiros do usuário e exibe a soma deles. Use
		//o operador +.
		int num1, num2, soma;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = scan.nextInt();
		soma = num1 + num2;
		System.out.println("A soma do número " + num1 + " mais o número " + num2 + " é igual a " + soma + "!");
		scan.close();
		

	}

}
