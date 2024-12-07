package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("Vector a. Enter the number position " + (i + 1) + ": ");
			a[i] = scan.nextInt();
		}
		System.out.println("\n");
		for(int j = 0; j <= b.length - 1; j++) {
			System.out.print("Vector b. enter the number position " + (j + 1) + ": ");
			b[j] = scan.nextInt();
			if(a[j] > b[j]) {
				c[j] = 1;
			} else if(a[j] == b[j]) {
				c[j] = 0;
			} else {
				c[j] = -1;
			}
		}
		scan.close();
		for(int k = 0; k < a.length; k ++) {
			if(k == 0) {
				System.out.print("\nVector a = {" + a[k] + " ");
			} else if(k == a.length -1) {
				System.out.print(a[k] + "}");
			} else {
				System.out.print(a[k] + " ");
			}
		}
		for(int k = 0; k < b.length; k ++) {
			if(k == 0) {
				System.out.print("\nVector b = {" + b[k] + " ");
			} else if(k == b.length -1) {
				System.out.print(b[k] + "}");
			} else {
				System.out.print(b[k] + " ");
			}
		}
		for(int k = 0; k < c.length; k ++) {
			if(k == 0) {
				System.out.print("\nVector c = {" + c[k] + " ");
			} else if(k == c.length -1) {
				System.out.print(c[k] + "}");
			} else {
				System.out.print(c[k] + " ");
			}
		}

	}

}
