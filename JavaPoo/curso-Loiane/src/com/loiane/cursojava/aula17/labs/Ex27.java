package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		double biggest, smallest, average, quantity;
		double sumTemperature, temperature;
		int count = 0;
		sumTemperature = temperature = 0;
		Scanner scan = new Scanner(System.in);
		biggest = smallest = average = count = 0;
		System.out.print("How many temperatures: ");
		quantity = scan.nextInt();		
		while(count < quantity) {
			System.out.print("Temperature " + (count + 1) + ": ");
			temperature = scan.nextDouble();
			sumTemperature += temperature; 
			if(count == 0) {				
				biggest = smallest = temperature;
			} else if (temperature > biggest){
				biggest = temperature;
			} else if(temperature < smallest) {
				smallest = temperature;
			}	
			count++;
		}
		scan.close();
		average = sumTemperature / quantity;
		System.out.println("the smallest temperature is " + smallest);
		System.out.println("the biggest temperature is " + biggest);
		System.out.println("the average temperature is " + average);
		

	}

}
