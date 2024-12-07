package com.loiane.cursojava.aula19.labs;

public class Ex02 {

	public static void main(String[] args) {
		int[] a = new int[8];
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i;
		}
		int[] b = new int[8];
		for(int i = 0; i <= b.length - 1; i++) {
			b[i] = (a[i] * 2);
		}
		for(int i = 0; i <= 7; i++) {
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i]);
		}

	}

}
