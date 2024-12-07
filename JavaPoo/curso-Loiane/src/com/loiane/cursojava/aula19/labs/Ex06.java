package com.loiane.cursojava.aula19.labs;

public class Ex06 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i;
			b[i] = i + 2;
			c[i] = a[i] + b[i];
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i] + "\tc[" + i + "] = " + c[i]);
		}
	}

}
