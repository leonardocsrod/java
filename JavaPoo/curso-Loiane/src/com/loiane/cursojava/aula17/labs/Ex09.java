package com.loiane.cursojava.aula17.labs;

public class Ex09 {

	public static void main(String[] args) {
		int count = 1;
		while(count <= 50) {
			if(count % 2 != 0) {
				System.out.println("Number: " + count);
			}
			
			count++;
		}
	}

}
