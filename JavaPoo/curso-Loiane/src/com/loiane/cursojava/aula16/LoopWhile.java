package com.loiane.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		int i = 0;
		int max = 10;
		System.out.println("Count until " + max);
		while(i <= max) {
			System.out.println("value of i: " + i);
			i++;
		}
		System.out.println("do - while");
		do {
			System.out.println("Value of i: " + i);
			i++;			
		} while(i <= 20);

	}

}
