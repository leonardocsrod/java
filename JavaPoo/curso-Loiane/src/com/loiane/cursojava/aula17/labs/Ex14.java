package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		int pair = 0;
		int odd = 0;
		int initial = number + 1;
		int final1 = number + 10;
		while(initial <= final1) {
			System.out.print("Number: " + initial + "\t");
			if(initial % 2 == 0) {
				pair++;				
			}else {
				odd++;
			}
			System.out.print("Number: " + pair + "\t");
			System.out.print("Number: " + odd + "\n");
			initial++;
		}
		
		scan.close();

	}

}
