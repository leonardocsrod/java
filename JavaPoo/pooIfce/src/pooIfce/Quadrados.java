package pooIfce;

import java.util.Scanner;

public class Quadrados {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Quadrado: ");
		int count = scan.nextInt();
		for( i = 0; i <= count -1; i++) {
			System.out.println();
			for( j = 0; j <= count - 1; j++) {
				System.out.print("*");
			}
			
		}
		scan.close();
	}

}
