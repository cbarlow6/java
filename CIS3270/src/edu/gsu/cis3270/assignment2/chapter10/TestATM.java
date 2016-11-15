package edu.gsu.cis3270.assignment2.chapter10;
import java.util.Scanner;
import java.util.Date;

public class TestATM {
	public static void main(String [] args){
		
		int[] accounts = new int[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter user id");
		
		int id = input.nextInt();
		
		while(id > 9 || id < 0){
			System.out.println("Re-enter user id");
			id = input.nextInt();
		}
		
		if(id <= 9 && id >= 0){
			
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println("Enter a choice: ");
		
		}
		
		Account acct0 = new Account();
		
	input.close();	
	}

}
class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	//Constructors
	Account(){
			
	}
	
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		
		
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
	public void setId(int id){
		this.id = id;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
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

