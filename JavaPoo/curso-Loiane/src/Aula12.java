import java.util.Scanner;

public class Aula12 {

	public static void main(String[] args) {
		String nome;
		Scanner scan = new Scanner(System.in);
		System.out.println("Capture uma linha digitada pelo teclado.");
		nome = scan.nextLine();
		scan.close();
		System.out.println(nome);
	}

}
