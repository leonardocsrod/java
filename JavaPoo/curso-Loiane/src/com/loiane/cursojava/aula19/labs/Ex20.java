package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;

public class Ex20 {

	public static void main(String[] args) {
		double[] a = new double[20];
		double dollar = 5.5;
		DecimalFormat df = new DecimalFormat("###,###.###");		
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = dollar * i;
			System.out.println("a[" + (i + 1) + "] =   " + df.format(a[i]));
		}

	}

}
