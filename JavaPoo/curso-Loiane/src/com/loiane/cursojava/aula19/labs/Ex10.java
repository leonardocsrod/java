package com.loiane.cursojava.aula19.labs;

public class Ex10 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i;
			b[i] = a[i] % 2;
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i]);
		}

	}

}
