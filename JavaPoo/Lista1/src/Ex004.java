import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		// 4. Comparação de Idade
		//	Receba duas idades e determine qual é maior, ou se são iguais. Use operadores relacionais (>,
		//	<, ==) para comparar as idades.
		Scanner scan = new Scanner(System.in);
		int idade1, idade2;
		System.out.print("Informe a primeira idade: ");
		idade1 = scan.nextInt();
		System.out.print("Informe a segunda idade: ");
		idade2 = scan.nextInt();
		if(idade1 > idade2) {
			System.out.println("A idade 1(" + idade1 + ")" + " é maior que a idade 2(" + idade2 + ")!");
		}else {
			if(idade1 == idade2) {
				System.out.println("A idade 1(" + idade1 + ")" + " é igual a idade 2(" + idade2 + ")!");
			}else {
				System.out.println("A idade 1(" + idade1 + ")" + " é menor que a idade 2(" + idade2 + ")!");
			}
			
		}
		scan.close();
	}

}
