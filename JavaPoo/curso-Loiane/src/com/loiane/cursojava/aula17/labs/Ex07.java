package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int number = 0;
		int bigger = 0;
		while(count <= 5) {
			System.out.print("Enter the number " + count + ": ");
			number = scan.nextInt();
			if(number > bigger) {
				bigger = number;
			}
			count++;
		}
		System.out.println("The biggest number is " + bigger);
		scan.close();

	}

}
