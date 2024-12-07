package com.loiane.cursojava.aula19.labs;

public class Ex01 {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 0; i <= 4; i++) {
			a[i] = i;
		}
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("\n\n");
		int[] b = new int[5];
		for(int i = 0; i <= b.length - 1; i++) {
			b[i] = a[i];
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
