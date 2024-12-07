package com.loiane.cursojava.aula19.labs;

public class Ex11 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int count = 0;
		for(int i = 0; i < a.length - 1; i++) {
			a[i] = i;
			if(a[i] % 2 == 0) {
				System.out.println(a[i] + " is pair.");
				count++;
			}
		}
		System.out.println("The quantity of  pair numbers is " + count);

	}

}
