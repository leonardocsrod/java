package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		double [] tempDia = new double[365];
		//double temperatures[];
		tempDia[0] = 31.3;
		tempDia[1] = 33.3;
		tempDia[2] = 32.3;
		tempDia[3] = 34.3;
		tempDia[4] = 37.3;
		tempDia[5] = 36.3;
		for(int i = 0; i <= 5; i++) {
			System.out.println("The temperature of the day " + (i + 1) + " is " + tempDia[i]);
		}
		System.out.println("The lenth of the array is " + tempDia.length);
		for(double temp : tempDia) {
			System.out.println("The temperature of the day is " + temp);
		}

	}

}
