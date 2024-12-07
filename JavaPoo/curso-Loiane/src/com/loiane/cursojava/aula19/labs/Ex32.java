package com.loiane.cursojava.aula19.labs;

public class Ex32 {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				System.out.print("Vector a = {" + a[i] + ", ");
			} else if(i == a.length - 1) {
				System.out.print(a[i] + "}\n");
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		int i = 0;
		int j = 0;
		for(i = 0; i < a.length; i++) {
			System.out.println();
			for(j = 0; j <= 10; j++)
			System.out.println(j + " * " + a[i] + " = " + a[i] * j);			
		}

	}

}
