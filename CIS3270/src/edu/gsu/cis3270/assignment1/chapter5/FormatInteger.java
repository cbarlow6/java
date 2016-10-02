package edu.gsu.cis3270.assignment1.chapter5;

import java.util.Scanner;

public class FormatInteger {
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);	
	
		System.out.println("Enter a number:  ");	
		int number = input.nextInt();
	
		System.out.println("Enter a width: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
	input.close();
	} 
			public static String format(int number, int width){
			String value = String.format("%0" + width + "d", number);	
			
				
			return value;
			}
}
