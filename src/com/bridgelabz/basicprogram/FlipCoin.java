package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class FlipCoin {

	int heads = 0; 

	
	
	public static void main(String[] args) {

		FlipCoin flipCoin = new FlipCoin(); 
		flipCoin.start();
	}

	void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of flips:");
		int numberOfFlips = scanner.nextInt();

		scanner.close();

		if (numberOfFlips < 1) {	

			
			System.out.println("Number must be greater than 0");
			start();
		}

		for (int i = 0; i < numberOfFlips; i++) {
			double randomValue = Math.random();
			if (randomValue < 0.5) {	
				
				System.out.print("Tails\t");
			} else {	

				System.out.print("Heads\t");
				heads++;
			}
		}

		
		
		System.out.println();
		System.out.println("Heads Percentage: " + (double) heads / numberOfFlips);
		System.out.println("Tails Percentage: " + ((double) numberOfFlips - heads) / numberOfFlips);

	}
}