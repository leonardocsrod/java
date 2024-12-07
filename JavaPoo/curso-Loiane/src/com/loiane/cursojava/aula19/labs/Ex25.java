package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("Enter the number position " + (i + 1) + ": ");
			a[i] = scan.nextInt();
			if(a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
		}
		scan.close();
		
		for(int i = 0; i <= a.length - 1; i++) {
			if(i == 0) {
				System.out.print("\nVector a = {" + a[i] + " ");
			} else if(i == a.length -1) {
				System.out.println(a[i] + "}");
			} else {
				System.out.print(a[i] + " ");
			}
		}
		for(int i = 0; i <= a.length - 1; i++) {
			if(i == 0) {
				System.out.print("\nVector b = {" + b[i] + " ");				
			} else if(i == a.length - 1) {
				System.out.print(b[i] + "}");
			} else {
				System.out.print(b[i] + " ");
			}
		}
		

	}

}
