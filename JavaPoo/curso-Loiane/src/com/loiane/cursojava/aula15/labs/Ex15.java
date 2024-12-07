package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the side 1: ");
		int side1 = scan.nextInt();
		System.out.print("Enter the side 2: ");
		int side2 = scan.nextInt();
		System.out.print("Enter the side 3: ");
		int side3 = scan.nextInt();
		if(side1 < (side2 + side3) && side2 < (side3 + side1) && side3 < (side2 + side1)) {
			System.out.println("Os lados " + side1 + ", " + side2 + ", " + side3 + " formam um triângulo.");
			if(side1 != side2 && side1 != side3) {
				System.out.println("The triangle is scalene.");
			} else if((side1 == side2 && side2 != side3) || (side2 == side3 && side2 != side1) || (side1 == side3 && side2 != side3)) {
				System.out.println("The triangle is isosceles.");
			} else if(side1 == side2 && side2 == side3) {
				System.out.println("The triangle is equilateral.");
			}
		} else {
			System.out.println("Os lados " + side1 + ", " + side2 + ", " + side3 + " não formam um triângulo.");
		}
		
		
		scan.close();

	}

}
