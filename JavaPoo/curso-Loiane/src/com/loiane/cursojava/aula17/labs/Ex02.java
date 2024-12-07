package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		String password = "";
		boolean validPassword = false;
		do {
			System.out.print("Enter a name: ");
			name = scan.next();
			System.out.print("Enter a password: ");
			password = scan.next();
			if(name.equalsIgnoreCase(password)) {				
				System.out.println("The password is equal name. Change the name or the password!");
			} else {
				validPassword = true;
			}
		} while (!validPassword);
		System.out.println("The end!");
		scan.close();		

	}

}
