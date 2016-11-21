package edu.gsu.cis3270.assignment2.chapter8;
import java.util.Date;


public class TestAccount {
	public static void main(String [] args){
		Account myAccount = new Account();
		myAccount.setId(1122);
		myAccount.setBalance(20000);
		myAccount.setAnnualInterestRate(4.5);
		//myAccount.withdraw(2500);
		//myAccount.deposit(3000);
		
		
		System.out.println("The balance of account " + myAccount.getId()+ " is " + (myAccount.getBalance() - myAccount.withdraw() + myAccount.deposit())) ;
		System.out.println("The monthly interest is: " + myAccount.getMonthlyInterest());
		System.out.println("Date opened: " + myAccount.getDateCreated());
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

