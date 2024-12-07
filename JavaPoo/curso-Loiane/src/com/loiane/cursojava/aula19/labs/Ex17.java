package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int count = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
			if(a[i] > 35) {
				count++;
			}
		}
		System.out.println("The quantity of numbers above 35 is " + count);
		scan.close();

	}

}
