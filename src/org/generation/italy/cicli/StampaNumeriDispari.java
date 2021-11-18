package org.generation.italy.cicli;


import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.print("Scegli la lunghezza dell'array: ");
		n = scanner.nextInt();
		System.out.print("Hai scelto: " + n);
		
		int[] numeriNaturali = new int [n];
		
		
		scanner.close();
	}
	

}
