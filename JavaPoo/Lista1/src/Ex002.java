import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		// 2. Calculadora de Média
		// Receba três números do usuário e calcule a média aritmética. Use operadores aritméticos (+, /)
		// para fazer o cálculo.
		int numero1, numero2, numero3, mediaAritmetica;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		numero1 = scan.nextInt();	
		System.out.println("Digite o segundo número: ");
		numero2 = scan.nextInt();	
		System.out.println("Digite o terceiro número: ");
		numero3 = scan.nextInt();
		mediaAritmetica = (numero1 + numero2 + numero3) / 3;
		System.out.println("A méria aritmética entre os números " + numero1 + ", " + numero2 + ", e " + numero3 + " é igual a " + mediaAritmetica + "!");
		
		scan.close();
	}

}
