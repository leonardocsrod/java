package com.loiane.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		System.out.println("For - Regular");
		for(int i = 0; i <= 10; i++) {
			System.out.println("Value of i: " + i);
		}
		System.out.println("For - Two variables");
		for(int i = 0, j = 10; i <= j; i++, j--) {
			System.out.println("Value of i: " + i + " Value of j: " + j);			
		}
		System.out.println("For - Missing parts");
		int count = 0;
		for(; count <= 10;) {
			System.out.println("Value of count: " + count);
			count++;
		}
		System.out.println("For - no body");
		int sum = 0;
		for(int i = 0; i <= 10; sum += i++ ) {
			
		}
		System.out.println("The value of the sum is " + sum);

	}

}
