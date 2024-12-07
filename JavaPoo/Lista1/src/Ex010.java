import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		// 10. Calculadora Básica
		// Peça dois números e um operador (+, -, *, /) ao usuário. Implemente uma calculadora que, com
		// base no operador fornecido, realiza a operação correspondente e exibe o resultado
		int numero1, numero2;
		char operacao;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		numero1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		numero2 = scan.nextInt();
		System.out.print("Operação desejada[+, -, *, /]: ");
		operacao = scan.next().charAt(0);
		if(operacao == '+') {
			System.out.println("A soma entre " + numero1 + " e " + numero2 + " é " + (numero1 + numero2));
		}else {
			if(operacao == '-') {
				System.out.println("A difrerença entre " + numero1 + " e " + numero2 + " é " + (numero1 - numero2));
			}else {
				if(operacao == '*') {
					System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + (numero1 * numero2));
				}else {
					if(operacao == '/') {
						System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + (numero1 / numero2));
					}
				}
			}
		}
		
		scan.close();
		

	}

}
