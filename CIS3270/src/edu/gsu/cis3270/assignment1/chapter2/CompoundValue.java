package edu.gsu.cis3270.assignment1.chapter2;
import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the monthly saving amount for six months:");
	double savings = input.nextDouble();
	
	System.out.println("Enter the annual interest rate as a %: ");
	double monthlyInterest = input.nextDouble() /1200;
	
	double month1 = savings * (1 + monthlyInterest);
	double month2 = (month1 + savings) * (1 + monthlyInterest);
	double month3 = (month2 + savings) * (1 + monthlyInterest);
	double month4 = (month3 + savings) * (1 + monthlyInterest);
	double month5 = (month4 + savings) * (1 + monthlyInterest);
	double month6 = (month5 + savings) * (1 + monthlyInterest);
	
	System.out.print("After the sixth month, the account value is: " + (int)(month6 * 100 ) / 100.0);
	
	input.close();
	
	
	
		
	}
}
