package com.loiane.cursojava.aula19.labs;

public class Ex29 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		int[] c = new int[a.length * 2];
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i;
			b[i] = 2 * i;
		}
		
		for(int i = 0; i <= c.length - 1; i++) {
			if(i <= a.length - 1) {
				c[i] = a[i];
			} else {
				c[i] = b[i - 10]; 
			}
		}
		
		for(int i = 0; i <= a.length - 1; i++) {
			if(i == 0) {
				System.out.print("\nVector a = {" + a[i] + ", ");
			} else if(i == a.length - 1) {
				System.out.print(a[i] + "}");
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		for(int i = 0; i <= b.length - 1; i++) {
			if(i == 0) {
				System.out.print("\nVector b = {" + a[i] + ", ");
			} else if(i == b.length - 1) {
				System.out.print(b[i] + "}");
			} else {
				System.out.print(b[i] + ", ");
			}
		}
		for(int i = 0; i <= c.length - 1; i++) {
			if(i == 0) {
				System.out.print("\nVector c = {" + c[i] + ", ");
			} else if(i == c.length - 1) {
				System.out.print(c[i] + "}");
			} else {
				System.out.print(c[i] + ", ");
			}
		}
		

	}

}
