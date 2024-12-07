package com.loiane.cursojava.aula19.labs;

public class Ex14 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int sum = 0;
		int count = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "] = " + a[i]);
			if(a[i] % 2 != 0) {
				System.out.println("The number " + a[i] + " is odd.");
				sum += a[i];
				count++;
			}
			
		}
		double average = sum / count;
		System.out.println("The average of the odd numbers is " + average);
		

	}

}
