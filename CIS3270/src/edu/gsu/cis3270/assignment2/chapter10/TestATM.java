package edu.gsu.cis3270.assignment2.chapter10;

import java.util.Date;

public class TestATM {
	public static void main(String [] args){
		
		
		
		
	}

}
class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//Constructors
	public Account(){
			
	}
	public Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		
		
	}
	//Getter Methods
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
		
	}
	 
	public Date getDateCreated(){
		return dateCreated;
		
	}
	// Setter Methods
	public void setId(int newId){
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//Methods
	public double getMonthlyInterestRate() {
	    double monthlyInterestRate = (annualInterestRate /100 / 12);
		return monthlyInterestRate;
	  }

	public double getMonthlyInterest() {
		double monthlyInterest = ((getBalance()- withdraw() + deposit()) * getMonthlyInterestRate());
		return monthlyInterest;		
	}
	
	
	public double withdraw(){
		//amount = 0;
		return 2500;
		
	}
	public double deposit(){
		//amount = 0;
		return 3000;
	//return deposit();
	}
	
	
	
}

