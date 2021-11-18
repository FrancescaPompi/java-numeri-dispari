package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispariBonus {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// interazione con l'utente
		System.out.print("Scegli la lunghezza dell'array: ");
		int n = scanner.nextInt();
		System.out.println("Hai scelto: " + n);
		
		// array
		int[] numeriNaturali = new int [n];
		Random random = new Random();
		
		System.out.println("I numeri dispari casuali nella tua lista sono: ");
		
		int numeroDiDispari = 0;
		int numeroDiPari = 0;
		//int somma = 0;
		
		for(int i = 0; i < numeriNaturali.length; i++) {
			int numeriCasuali = random.nextInt(100) + 0;
			numeriNaturali[i] = numeriCasuali;
			
			if(numeriNaturali[i] % 2 != 0) {
				System.out.print(numeriNaturali[i] + " ");
				numeroDiDispari++;
			} else {
				System.out.print("");
				numeroDiPari++;
			}
			
		}
		
		System.out.println("\nI numeri dispari sono: " + numeroDiDispari);
		System.out.println("I numeri pari sono: " + numeroDiPari);
		
		
		scanner.close();

	}

}
