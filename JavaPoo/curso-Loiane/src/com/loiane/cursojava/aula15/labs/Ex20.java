package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contYes = 0;
		String letter = "a";
		System.out.print("Did you call the victim[y/n]? ");
		letter = scan.next();
		if(letter.equalsIgnoreCase("y")) {
			contYes++;
			System.out.println("Very suspicious.");
		} else if(letter.equalsIgnoreCase("n")) {
			System.out.println("ok");
		}
		System.out.print("Were you at the crime scene[y/n]? ");
		letter = scan.next();
		if(letter.equalsIgnoreCase("y")) {
			contYes++;
			System.out.println("Very suspicious.");
		} else if(letter.equalsIgnoreCase("n")) {
			System.out.println("ok");
		}
		System.out.print("Do you live near the victim[y/n]? ");
		letter = scan.next();
		if(letter.equalsIgnoreCase("y")) {
			contYes++;
			System.out.print("Very suspicious.");
		} else if(letter.equalsIgnoreCase("n")) {
			System.out.println("ok");
		}
		System.out.print("Did you own money to the victim[y/n]? ");
		letter = scan.next();
		if(letter.equalsIgnoreCase("y")) {
			contYes++;
			System.out.print("Very suspicious.");
		}else if(letter.equalsIgnoreCase("n")) {
			System.out.println("ok");
		}
		System.out.print("Have you ever worked with the victim[y/n]? ");
		letter = scan.next();
		if(letter.equalsIgnoreCase("y")) {
			contYes++;
			System.out.print("Very suspicious.");
		} else if(letter.equalsIgnoreCase("n")) {
			System.out.println("ok");
		}
		if(contYes == 2) {
			System.out.println("You are suspicious.");
		} else if(contYes > 2 && contYes <= 4){
			System.out.println("You are an accomplice.");
		} else if(contYes == 5) {
			System.out.println("You are the killer.");
		} else {
			System.out.println("You are innocent.");
		}
		scan.close();

	}

}
