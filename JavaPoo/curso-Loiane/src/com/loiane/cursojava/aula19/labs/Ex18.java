package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int smaller, bigger, positionS, positionB;
		smaller = bigger = positionS = positionB = 0;
		for(int i = 0; i <= a.length - 1; i++) {
			System.out.print("Enter the age " + (i + 1) + ": ");
			a[i] = scan.nextInt();
			if(i == 0) {
				smaller = bigger = a[i];
			}
			if(a[i] < smaller) {
				smaller = a[i];
				positionS = i;
			}
			if(a[i] > bigger) {
				bigger = a[i];
				positionB = i;
			}			
		}
		System.out.println("The smaller age is " + smaller + ", in the position a[" + positionS + "].");		
		System.out.println("The bigger age is " + bigger + ", in the position a[" + positionB + "].");
		scan.close();

	}

}
