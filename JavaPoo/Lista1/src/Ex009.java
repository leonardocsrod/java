import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		// 9. Verificação de Maioridade
		// Peça duas idades e verifique se ambas as pessoas são maiores de idade (>= 18). Use
		// operadores lógicos (&&) e relacionais para fazer a verificação
		int idade1, idade2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira idade: ");
		idade1 = scan.nextInt();
		System.out.print("Informe a segunda idade: ");
		idade2 = scan.nextInt();
		if(idade1 < 18 && idade2 < 18) {
			System.out.println("Ambos são menores de 18 anos.");
		}else {
			if(idade1 < 18) {
				System.out.println("Idade 1 tem menos de 18 anos.");				
			}else {
				if(idade2 < 18) {
					System.out.println("Idade 2 tem menos de 18 anos.");
				}else {
					System.out.println("Ambas as idades são maiores de 18 anos.");
				}
			}
		}
		scan.close();

	}

}
