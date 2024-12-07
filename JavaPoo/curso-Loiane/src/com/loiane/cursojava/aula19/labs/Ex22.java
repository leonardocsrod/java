package com.loiane.cursojava.aula19.labs;

public class Ex22 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int sum0 = 0;
		//int sum1 = 1;
		double percent0 = 0;
		double percent1 = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = (int) Math.round(Math.random() * 1);
			System.out.println("a[" + i + "] = " + a[i]);
			if(a[i] == 0) {
				sum0++;
			}
//			if(a[i] == 1) {
//				sum1++;
//			}
		}
		percent0 = (sum0 * 100) / a.length;
		System.out.println("Percentage of 0: " + percent0);
		percent1 = 100 - percent0;
		System.out.println("Percentage of 1: " + percent1);
	}

}
