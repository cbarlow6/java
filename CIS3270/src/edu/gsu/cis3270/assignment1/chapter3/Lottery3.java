package edu.gsu.cis3270.assignment1.chapter3;
import java.util.Scanner;

public class Lottery3 {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 digit lottery number: ");
		
		int selection = input.nextInt();
		
		int number1 = selection / 10 / 10;
		int number2 = (selection /10) % 10;
		int number3 = selection % 10;
		
		System.out.println("Your picks: " + number1 + number2 + number3);
		
		int lottery1 = (int)(Math.random() * 10);
		int lottery2 = (int)(Math.random() * 10);
		int lottery3 = (int)(Math.random() * 10);
		
		System.out.println("Lottery numbers: " + lottery1 + lottery2 + lottery3);
		
		if(number1 == lottery1 && number2 == lottery2 && number3 == lottery3){
			
			System.out.println("You matched all numbers exactly. Winner $10,000");
			
		}
		else if(number1 == lottery1 
				|| number1 == lottery2
				|| number1 == lottery3
				|| number2 == lottery1 
				|| number2 == lottery2 
				|| number2 == lottery3
				|| number3 == lottery1 
				|| number3 == lottery2 
				|| number3 == lottery3){
			
			System.out.println("You matched at least 1 number. Winner $1,000 ");
		}
		else if(number1 == lottery2 && number2 == lottery3 && number3 == lottery1
					|| number1 == lottery3 && number2 == lottery1 && number3 == lottery2
					|| number1 == lottery1 && number2 == lottery3 && number3 == lottery2
					|| number1 == lottery3 && number2 == lottery2 && number3 == lottery1
					|| number1 == lottery2 && number2 == lottery1 && number3 == lottery3){
				System.out.println("You matched 3 numbers. Winner $3,000");
						
			}
		else { System.out.println("No numbers matched ");
				}
	input.close();
	}
	}
