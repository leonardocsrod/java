package com.loiane.cursojava.aula19.labs;

public class Ex16 {

	public static void main(String[] args) {
		int[] a = new int[10];
		int count1, count2, count3, sum1, sum3;
		count1 = count2 = count3 = sum1 = sum3 = 0;		
		System.out.print("Vector a: ");
		for(int i = 0; i <= a.length - 1; i++) {
			a[i] = i * 3;
			System.out.print(a[i] + " ");
		}
		for(int i = 0; i <= a.length - 1; i++) {
			if(a[i] < 15) {
				sum1 += a[i];
				count1++;				
			} else if(a[i] == 15) {
				count2++;
			} else {
				count3++;
				sum3 += a[i];
			}
		}
		double average3 = sum3 / (double)count3;
		double average1 = sum3 / (double)count1;
		System.out.println("\nThe sum of the numbers below 15 is " + sum1);
		System.out.println("The quantity of the numbers below 15 is " + average1);
		System.out.println("The numbers of the elements equal to 15 is " + count2);
		System.out.println("The average of the numbers above 15 is " + average3);
	}

}
