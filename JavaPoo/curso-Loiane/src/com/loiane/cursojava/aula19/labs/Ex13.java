package com.loiane.cursojava.aula19.labs;

public class Ex13 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "] = " + a[i]);
			if(a[i] % 5 == 0) {
				sum =+ a[i];
				System.out.println(a[i] + " is multiple of 5.");
			}
		}
		System.out.println("The sum of the multiple of 5, in the vector is " + sum);

	}

}
