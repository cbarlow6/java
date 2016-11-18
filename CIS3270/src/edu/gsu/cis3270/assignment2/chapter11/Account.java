package edu.gsu.cis3270.assignment2.chapter11;
import java.util.*;

public class Account {
		private String name;
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated = new Date();
		ArrayList<String> transactions = new ArrayList<>();
		
		//Constructors
		public Account(){
				
		}
		
		public Account(String name, int id, double balance){
			this.name = name;
			this.id = id;
			this.balance = balance;
			dateCreated = new Date();
		}
		
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;	
		}
		public void setAnnualInterestRate(double annualInterestRate){
			this.annualInterestRate = annualInterestRate;
		} 
		
		public Date getDateCreated(){
			return dateCreated;	
		}
			

		public double getMonthlyInterestRate() {
		    double monthlyInterestRate = (annualInterestRate /100 / 12);
			return monthlyInterestRate;
		  }

		public double getMonthlyInterest() {
			double monthlyInterest = (balance * getMonthlyInterestRate());
			return monthlyInterest;		
		}
		public ArrayList<String> getTransactions(){
			return transactions;
		}	
		
		public void withdraw(double amount){
			balance -= amount;
			transactions.add("Withdrawal " +"Amount " + amount +" Balance "+ balance);
		}
		public void deposit(double amount){
			balance += amount;
			transactions.add("Deposit " + "Amount " + amount +" Balance " + balance);
		}
		
}
class Transaction{
	
	private Date date = new Date();
	private char type;
	
	private double amount;
	private double balance;
	private String description;
	
	public Transaction(){
		
	}
	
	public Transaction(char type, double amount, double balance, String description){
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;	
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}