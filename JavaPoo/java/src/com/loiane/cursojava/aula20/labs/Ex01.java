package com.loiane.cursojava.aula20.labs;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//methods
		Random numberRandom = new Random();
		Scanner scan = new Scanner(System.in);
		
		//declaration of variables
		int[][] a = new int[4][4];		
		int bigger = 0;
		int smaller = 0;
		int biggeri = 0;
		int biggerj = 0;
		int smalleri = 0;
		int smallerj = 0;
		
		//include numbers
		for(int i = 0 ; i < a.length;i++) {
			for(int j = 0; j < a[i].length; j++) {
				//System.out.print("Number a[" + i + "][" + j + "]: ");
				a[i][j] = numberRandom.nextInt(100);
				if(i == 0 && j == 0) {
					bigger = smaller = a[i][j];
				} else if(a[i][j] > bigger) {
					bigger = a[i][j];
					biggeri = i;
					biggerj = j;
				} else if(a[i][j] < smaller) {
					smaller = a[i][j];
					smalleri = i;
					smallerj = j;
				}
			}
		}
		scan.close();
		
		//print numbers
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(i == 0 && j == 0) {
					System.out.print("Vector a: {" + a[i][j] + ", ");
				} else if(i == j && j == a[i].length - 1){
					System.out.println(a[i][j] + "}");					
				} else {
					System.out.print(a[i][j] + ", ");
				}
				
			}
		}
		
		//print bigger-smaller
		System.out.println("the bigger number is " + bigger + " in the position a[" + biggeri +
				"][" + biggerj + "]");
		System.out.println("the smaller number is " + smaller + " in the position a[" + smalleri +
				"][" + smallerj + "]");

	}

}
