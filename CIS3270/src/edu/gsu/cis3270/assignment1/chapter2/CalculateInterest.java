package edu.gsu.cis3270.assignment1.chapter2;
import java.util.Scanner;

public class CalculateInterest {
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter account balance: " );
	
	double balance = input.nextDouble();
	
	System.out.println("Enter annual percentage interest rate: ");
	
	double monthlyInterestRate = input.nextDouble() / 1200;
	
	double monthlyInterest = balance * monthlyInterestRate;
	
	System.out.println("Monthly interest is: " + (int)(monthlyInterest * 100) / 100.0);
	
	input.close();
		
		
	}
}
