package edu.gsu.cis3270.assignment2.chapter11;

public class TestAccount11_08 {
	public static void main(String[] args){
		
		Account myAccount = new Account("George", 1122, 1000);
		myAccount.deposit(30);
		myAccount.deposit(40);
		myAccount.deposit(50);
		
		myAccount.withdraw(5);
		myAccount.withdraw(4);
		myAccount.withdraw(2);
		
		myAccount.setAnnualInterestRate(1.5);
		
		System.out.println("Account Summary");
		System.out.println("Name: " + myAccount.getName() + "\nInterest Rate: " +
				myAccount.getAnnualInterestRate() + "\nBalance: " + myAccount.getBalance());
	
		for(int i = 0; i < myAccount.transactions.size(); i++)
		System.out.println(myAccount.transactions.get(i) + " ");
	}
	
	
}
