package com.bridgelabz.basicprogram;
import java.util.Scanner;
public class Leapyear {

	
	void test(){
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter year to check: ");
		int year = scanner.nextInt();
		
		if((year / 1000) == 0){	
			System.out.println("Year should be in 4 digits!!!");
			test();
		}
		else{
			if((year % 4) == 0){	
				System.out.println("Leap year");
			}
			else{	
				System.out.println("Not a leap year");	
			}
		}
		
		scanner.close();

	}

		public static void main(String[] args) {

			Leapyear leapYear = new Leapyear();
			
			
			leapYear.test();
		}

		
	}
	

