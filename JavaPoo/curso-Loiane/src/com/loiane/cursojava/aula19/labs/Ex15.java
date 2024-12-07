package com.loiane.cursojava.aula19.labs;

public class Ex15 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int countPair = 0;
		int countOdd = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "] = " + a[i]);
			if(a[i] % 2 == 0) {
				countPair++;
			} else {
				countOdd++;
			}
		}
		double percentPair = (countPair * 100) / a.length;
		double percentOdd = (countOdd * 100) / a.length;
		System.out.println("Count pair: " + countPair);
		System.out.println("Count odd: " + countOdd);
		System.out.println("a.lenght: " + a.length);
		System.out.println("The percentage of pair numbers is " + percentPair + "%.");
		System.out.println("The percentage of odd numbers is " + percentOdd + "%.");
	}

}
