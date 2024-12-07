package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the n-th term of the sequence: ");
		int nTh = scan.nextInt();
		int count = 3;
		System.out.println("Fibonacci sequence: ");
		System.out.print(first + ", ");
		System.out.print(second + ", ");	
		int next = 0;
		while(count <= nTh) {
			next = first + second;
			first = second;
			second = next;	
			if(count == 10) {
				System.out.print(next);
			} else {

				System.out.print(next + ",");
			}
			count++;
		}
		scan.close();

	}

}
