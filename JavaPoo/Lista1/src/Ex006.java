import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		// 6. Desconto Aplicado
		//	Crie um programa que calcula o preço com desconto. Receba o preço original e o percentual
		//	de desconto (ex: 15%). Use o operador de multiplicação * e subtração - para calcular o valor
		// 	final.
		float preco, desconto, precoFinal;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o preço do produto: ");
		preco = scan.nextFloat();
		System.out.print("Informe o desconto: ");
		desconto = scan.nextFloat();
		precoFinal = preco * (1 - (desconto / 100));
		System.out.println("O produto tem o preço inicial de R$ " + preco + ".");
		System.out.println("O desconto é de " + desconto + " por cento.");
		System.out.println("O preço final do produto é R$ " + precoFinal + ".");
		
		
		scan.close();
		

	}

}
