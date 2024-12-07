package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		int[] a = new int[10];
		boolean palindrome = true;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i <= a.length - 1;i++) {
			System.out.print("Enter the number " + (i + 1) + ": ");
			a[i] = scan.nextInt();
			System.out.println("\n");
		}
		if(a.length % 2 == 0) {
			for(int  i = 0; i <= a.length / 2; i++) {
				if(a[i] != a[a.length - (i + 1)] ) {
					System.out.println("Its not a palindrome.");
					palindrome = false;
					break;
				}				
			}
		}
		
		for(int i = 0; i <= a.length - 1; i++) {
			if(i == 0) {
				System.out.print("Vector a = {" + a[i] + " ");
			} else if(i == a.length - 1) {
				System.out.println(a[i] + "}");
			} else {
				System.out.print(a[i] + " ");
			}
			
		}
		if(palindrome) {
			System.out.println("\nIts a palindrome.");
		}
		
		scan.close();

	}

}
