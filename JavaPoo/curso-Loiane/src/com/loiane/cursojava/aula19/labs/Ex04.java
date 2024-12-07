package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = new int[15];
		double[] b = new double[15];
		DecimalFormat df = new DecimalFormat("###,###.##");
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i;
			b[i] = Math.sqrt(a[i]);
			System.out.println("a[" + i + "] = " + a[i] + "\tb[" + i + "] = " + df.format(b[i]));
		}

	}

}
