package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		double[] c = new double[10];
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = scan.nextInt();
			b[i] = a[i] * 3;
			c[i] = b[i] / a[i]; 
		}
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i] + "\tc[" + i + "] = " + c[i]);
		}
		scan.close();

	}

}
