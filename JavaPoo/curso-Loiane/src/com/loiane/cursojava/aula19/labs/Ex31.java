package com.loiane.cursojava.aula19.labs;

public class Ex31 {

	public static void main(String[] args) {
		int[] a = new int[20];
		int[] b = new int[a.length];
		int posA = 0;
		int posB = 0;
		for(int i = 0; i < a.length; i++) {
			if(i % 2 == 0) {
				a[posA] = i;
				posA++;
			}else {
				b[posB] = i;
				posB++;
			}
			
		}
		
		
		for(int i = 0; i < posA; i++) {
			if(i == 0) { 
				System.out.print("\nVector a = {" + a[i] + ", ");
			} else if(i == posA - 1) {
				System.out.print(a[i] + "}");
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		
		for(int i = 0; i < posB; i++) {
			if(i == 0) { 
				System.out.print("\nVector b = {" + b[i] + ", ");
			} else if(i == posB - 1) {
				System.out.print(b[i] + "}");
			} else {
				System.out.print(b[i] + ", ");
			}
		}

	}

}
