package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
			System.out.print("b[" + i + "]: ");
			b[i] = scan.nextInt();
			c[i] = a[i] * b[i];
		}
		scan.close();
		for(int i = 0; i <= a.length -1; i++) {
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i] + "\tc[" + i + "] = " + c[i]);
		}

	}

}
