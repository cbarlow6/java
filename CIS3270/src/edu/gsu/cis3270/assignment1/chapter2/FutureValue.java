package edu.gsu.cis3270.assignment1.chapter2;
import java.util.Scanner;

public class FutureValue {

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter investment amount: ");
	double investment = input.nextDouble();
	
	System.out.println ("Enter annual percentage rate:");
	double monthlyInterestRate = input.nextDouble() / 1200;
	
	System.out.println("Enter number of years: " );
	int months =  input.nextInt() * 12;
	
	double futureInvestment = investment * Math.pow(1 + monthlyInterestRate, months);
	
	System.out.println("Accumulated value is: " + (int)(futureInvestment * 100) / 100.0);
	
	input.close();
	
	
		
		
		
	}
	
	
}
