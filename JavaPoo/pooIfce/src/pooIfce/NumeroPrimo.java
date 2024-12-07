package pooIfce;

import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String[] args) {
		int cont = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Números primos até: ");
		int primo = scan.nextInt();
		
		int i = 0;
		int j = 0;
		for(i = 0; i <= primo; i++) {
			for(j = 1, cont = 0; j <= i; j++) {
				if(i % j == 0) {
					cont++;
				}
				
			}
			if(cont == 2) {
				System.out.println("O número " + i + " é primo.");
			}
			
		}
		scan.close();
	}

}
