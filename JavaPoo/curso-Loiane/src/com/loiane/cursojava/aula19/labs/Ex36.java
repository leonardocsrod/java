package com.loiane.cursojava.aula19.labs;

public class Ex36 {

	public static void main(String[] args) {
		int[] a = new int[11];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)Math.pow(2, i); 
		}
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				System.out.print("Vector a = {" + a[i] + ", ");
			} else if(i == a.length - 1) {
				System.out.print(a[i] +"}\n");
			} else {
				System.out.print(a[i] + ", ");
			}
		}

	}

}
