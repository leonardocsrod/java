import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		// 5. Número Dentro do Intervalo
		//	Receba um número e verifique se ele está entre 10 e 20, inclusive. Use operadores lógicos
		//	(&&) e relacionais (>=, <=).
		int numero;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		if(numero >= 10 && numero <= 20) {
			System.out.println("O número " + numero + " está no intervalo entre 10 e 20!");
		}else {
			System.out.println("O número " + numero + " não está no intervalo entre 10 e 20!");
		}
		scan.close();


	}

}
