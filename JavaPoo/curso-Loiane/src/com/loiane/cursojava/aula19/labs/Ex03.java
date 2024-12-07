package com.loiane.cursojava.aula19.labs;

public class Ex03 {

	public static void main(String[] args) {
		int[] a = new int[15];
		int i = 0;
		for(i = 0; i <= a.length - 1; i++) {
			a[i] = i;
		}
		i = 0;
		int[] b = new int[15];
		for(i = 0; i <= b.length - 1; i++){
			b[i] = (int)Math.pow(a[i], 2);
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + b[i]);
		}

	}

}
