package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//declaration array and variable
		String[][] compromisso = new String[31][24];
		int option = 0;
		
		boolean out = false;
		
		//method
		Scanner scan = new Scanner(System.in);
		
		//build menu
		while(!out) {
			System.out.println("CALENDAR");
			System.out.println("0 - Sair");
			System.out.println("1 - Marcar compromisso");
			System.out.println("2 - Verificar compromisso");
			
			System.out.print("Option: ");
			option = scan.nextInt();
			if(option == 0) {
				out = true;
			} else if(option == 1) {//marcar compromisso
				boolean diaValido = false;
				int day = 0;
				while(!diaValido) {
					System.out.print("Day: ");
					day = scan.nextInt();
					if(day >= 0 &&  day <= 31) {
						diaValido = true;
					} else {
						System.out.println(" Invalid day. Digit again.");
					}
				}
				boolean horaValida = false;
				int hour = 0;
				while(!horaValida) {
					System.out.print("Hour: ");
					hour = scan.nextInt();
					if(hour >= 0 && hour < 24) {
						horaValida = true;
					} else {
						System.out.println("Invalid hour. Digit again.");
					}
				}
			day--;				
			System.out.print("Enter the schedule: ");	
			compromisso[day][hour] = scan.next();
				
			} else if(option == 2) {//verificar compromisso
				boolean diaValido = false;
				int day = 0;
				while(!diaValido) {
					System.out.print("Day: ");
					day = scan.nextInt();
					if(day >= 0 &&  day <= 31) {
						diaValido = true;
					} else {
						System.out.println(" Invalid day. Digit again.");
					}
				}
				boolean horaValida = false;
				int hour = 0;
				while(!horaValida) {
					System.out.print("Hour: ");
					hour = scan.nextInt();
					if(hour >= 0 && hour < 24) {
						horaValida = true;
					} else {
						System.out.println("Invalid hour. Digit again.");
					}
				}
			day--;
			System.out.println("Schedule: " + compromisso[day][hour] + "\n");
				
			} else {
				System.out.println("Invalid option\n\n");
			}
			
		}
		
		
		
		scan.close();
		
//		for(int k = 0; k < month.length; k++) {
//			for(int l = 0; l < month[k].length; l++) {
//				if(k == 0 && l == 0) {
//					System.out.print("month: \n" + month[k][l] + " ");
//				} else if(l == month[k].length - 1) {
//					System.out.print(month[k][l] + "\n");
//				}
//				System.out.print(month[k][l] + " ");
//			}
//		}

	}

}
