package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
			sum += a[i];
		}
		scan.close();
		System.out.print("Vector a: ");
		for(int i = 0; i <= a.length - 1; i++) {
			if(i == a.length - 1) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + " => ");
			}
			
		}
		System.out.println("\nThe sum of the elements of the vector is " + sum + "!");
		

	}

}
