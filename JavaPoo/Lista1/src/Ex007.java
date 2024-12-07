import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		// 7. Verificação de Votação
		// Peça a idade do usuário e verifique se ele pode votar (idade >= 16). Use operadores
		// relacionais para determinar se a idade é suficiente para votar.
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a sua idade: ");
		idade = scan.nextInt();
		if(idade < 16) {
			System.out.println("Você tem " + idade + " anos de idade. Ainda não pode votar. Espere completar 16 anos.");
		}else {
			if(idade >= 16 && idade < 18) {
				System.out.println("Você tem de " + idade + " anos de idade. Seu voto é facultativo.");							
			}else {
				if(idade >= 18 && idade < 70) {
					System.out.println("Você tem de " + idade + " anos de idade. Seu voto é obrigatório.");							
				}else {
					System.out.println("Você tem de " + idade + " anos de idade. Seu voto é facultativo.");	
				}
			}
		}
		scan.close();

	}

}
