package edu.gsu.cis3270.assignment1.chapter4;
import java.util.Scanner;

public class RevisedLottery {
	public static void main(String [] args){
		// Generate two distinct digits
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		while (number1==number2){
			
			number2 = (int)(Math.random() * 10);
			
		}
		// Prompt user for two digits
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two digits");
		
		int guess = input.nextInt();
		
		int guess1 = guess/ 10;
		int guess2 = guess % 10;
		
		System.out.println("Lottery numbers: " + number1 + " " + number2);
		System.out.println("Your picks: " + guess1 + " "+ guess2);
		
		if (number1 == guess1 && number2 == guess2){
			
			System.out.print("Exact match. You win $10,000");
		}
		else if(number1 == guess2 && number2 == guess1){
			
			System.out.print("Match all digits. You win $3,000");
				
		}else if(number1 == guess2
				|| number1 == guess1
				|| number2 == guess2
				|| number2 == guess1){
			System.out.print("Match one digit. You win $1,000");
		}
			else{
				System.out.print("You match no digits");
		}
		
		
		
		
		input.close();	
	}

}
