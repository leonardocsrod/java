package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = scan.nextDouble();
		if(a == 0) {
			System.out.println("The equation is not quadratic.");					
				} else {
					System.out.print("Enter b: ");
					double b = scan.nextDouble();
					System.out.print("Enter c: ");
					double c = scan.nextDouble();
					double delta = (b * b) - (4 * a * c);
					if(delta < 0) {
						System.out.println("Delta is " + delta);
						System.out.println("There are no roots.");
					} else if (delta == 0){
						System.out.println("Delta is " + delta);
						double onlyRoot = -b / (2 * a);
						System.out.println("The root is " + onlyRoot);
					} else {
						System.out.println("Delta is " + delta);
						double root1 = (((-b) + (Math.sqrt(delta))) / (2 * a));
						System.out.println("The root 1 is " + root1);
						double root2 = (((-b) - (Math.sqrt(delta))) / (2 * a));
						System.out.println("The root 2 is " + root2);
					}
				}
		
		
		scan.close();

	}

}
