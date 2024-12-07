package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int multiTable = 0;
		int count = 1;
		System.out.print("Which multiplication table: ");
		multiTable = scan.nextInt();
		scan.close();
		while(count <= 10) {
			System.out.println(count + " * " + multiTable + " = " + (count * multiTable));
			count++;
		}

	}

}
