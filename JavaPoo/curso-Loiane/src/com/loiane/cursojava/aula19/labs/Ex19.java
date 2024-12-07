package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] n1 = new double[10];
		double[] n2 = new double[10];
		double[] result = new double[10];
		String[] situation = new String[10];
		
		for(int i = 0; i <= n1.length - 1; i++) {
			System.out.println("Student " + (i + 1) + ": ");
			System.out.print("N1: ");
			n1[i] = scan.nextDouble();
			System.out.print("N2: ");
			n2[i] = scan.nextDouble();
			result[i] = (n1[i] + n2[i]) / 2;
			if(result[i] >= 7) {
				situation[i] = "Aproved";
			} else {
				situation[i] = "Failed";
			}
		}
		for(int i = 0; i <= n1.length - 1; i++) {
			System.out.println("Student " + (i + 1) + "=> \tAverage: " + result[i] + "\tSituation: " + situation[i]);
		}
		scan.close();

	}

}
