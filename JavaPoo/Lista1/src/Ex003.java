import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		// 3. Par ou Ímpar
		//Peça um número ao usuário e determine se ele é par ou ímpar. Use o operador de módulo %
		//para verificar o resto da divisão por 2.
		int numero1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero1 = scan.nextInt();
		if(numero1 % 2 == 0) {
			System.out.print("O número " + numero1 + " é par.");
		}else {
			System.out.print("O número " + numero1 + " é impar.");
		}
		scan.close();
	}

}
