package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		int[] vectorA = new int[10];
		for(int i = 0; i <= vectorA.length - 1; i++) {
			System.out.print("Enter the number " + (i + 1) + ": ");		
			vectorA[i] = scan.nextInt();
			if(vectorA[i] % 2 == 0) {
				System.out.println("The number " + vectorA[i] + " is pair.");
				break;
			}
		}
		System.out.println("End of the programm.");
		scan.close();

	}

}
