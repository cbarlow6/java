package edu.gsu.cis3270.assignment2.chapter10;
import java.util.Scanner;
import java.util.Date;

public class TestATM {
	public static void main(String [] args){
		//Account account = new Account(id);
		//Account account2 = new Account(2);
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		for( ; ; ){
		System.out.println("Enter user id");
		
		int id = input.nextInt();
		Account account = new Account(id);
		while(id > 9 || id < 0){
			System.out.println("Re-enter user id");
			id = input.nextInt();
		}
		
		for( ; ; ){
		if(id <= 9 && id >= 0){
			System.out.println();
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println("Enter a choice: ");
		}
		
		
		int choice = input.nextInt();
		
		while(choice < 1 || choice > 4){
			System.out.println("Re-enter user choice");
			choice = input.nextInt();
		}
		
		while(choice != 4){
			if(choice == 1){
				System.out.println("The balance is: " + account.getBalance(id));
				break;
			}
			if(choice == 2){
				System.out.println("Enter amount to withdraw: " );
				double amount = input.nextDouble();
				account.withdraw(id, amount);
				break;
			}
			if(choice == 3){
				System.out.println("Enter amount to deposit: " );
				double amount = input.nextDouble();
				account.deposit(id, amount);
				break;
			}
			else
				break;
				
		}
		if(choice == 4)
			break;
		}
		}
		
	
	}

}


class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	double[] accounts = new double[]{100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
	
	//Constructors
	public Account(){
			
	}
	
	public Account(int id){
		this.id = id;
		//this.balance = balance;
		
		
	}
	//Getter Methods
	public int getId() {
		return id;
	}
	public double getBalance(int id) {
		return accounts[id];
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
	
	public void setBalance(int id, double balance){
		accounts[id] = balance;
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
		double monthlyInterest = (balance * getMonthlyInterestRate());
		return monthlyInterest;		
	}
	
	
	public void withdraw(int id, double amount){
		 accounts[id] -= amount;
		
	}
	public void deposit(int id, double amount){
		 accounts[id] += amount;
	}
	
	
	
}

