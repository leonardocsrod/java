package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next = 0;
		Scanner scan = new Scanner(System.in);
		while(next <= 500) {
			next = first + second;
			first = second;
			second = next;
			
			System.out.println(next + ", ");
		}
		scan.close();

	}

}
