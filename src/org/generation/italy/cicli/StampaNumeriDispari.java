package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// interazione con l'utente
		System.out.print("Scegli la lunghezza dell'array: ");
		int n = scanner.nextInt();
		System.out.println("Hai scelto: " + n);
		
		System.out.println("Creo un array con " + n + " numeri naturali casuali: ");
		
		int[] numeriNaturali = new int [n];
		Random random = new Random();
		
		for(int i = 0; i < numeriNaturali.length; i++) {
			int numeriCasuali = random.nextInt(100) + 0;
			numeriNaturali[i] = numeriCasuali;
			System.out.print(numeriNaturali[i] + " ");
		}
		
		
		
		scanner.close();
	}
	

}
