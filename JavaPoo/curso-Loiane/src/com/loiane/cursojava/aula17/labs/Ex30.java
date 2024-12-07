package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tab, starTab, endTab;
		tab = starTab = endTab = 0;
		System.out.print("Which multi table: ");
		tab = scan.nextInt();
		
		System.out.print("Start in: ");
		starTab = scan.nextInt();
		System.out.print("End in: ");
		endTab = scan.nextInt();			
		if(starTab >= endTab) {
			System.out.print("Start in: ");
			starTab = scan.nextInt();
			System.out.print("End in: ");
			endTab = scan.nextInt();
		}
		int result = 0;
		
		while(starTab <= endTab) {
			result = tab * starTab;
			System.out.println(tab + " * " + starTab + " = " + result);
			starTab++;
		}
		
		
		scan.close();

	}

}
