package edu.gsu.cis3270.assignment1.chapter2;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		
		
		int number = input.nextInt();
		if (number > 0 && number < 1000){
		int addend1 = number % 10;
		int addend2 = (number / 10) /10;
		int addend3 = (number/ 10) % 10;
		
		System.out.println(addend1 + addend2 + addend3);
		}
		
		else{
			System.out.println("Number entered must be between 0 and 1000. Try again.");
			
		}
		input.close();
		
		
	}
}
