package edu.gsu.cis3270.assignment2.chapter8;
import java.util.*;
class Account{
	
private int id;
private double balance;
private double annualInterestRate;
private Date dateCreated;

Account(){
	
	id = 0;
	balance = 0;
	annualInterestRate = 0;
	
}
	
Account(int newId, double newBalance){
	id = newId;
	balance = newBalance;
	
}

int getId(){
	return id;
}

double getBalance(){
	return balance;
}

double getRate(){	
	return annualInterestRate;
}
Date getDate(){
	dateCreated = new Date();
	return dateCreated;
	
}
void setId(int newId){
	id = newId;
		
}
void setBalance(int newBalance){
	balance = newBalance;
}		
void setRate(double newAnnualInterestRate){
	annualInterestRate = newAnnualInterestRate;
}

public double getMonthlyInterestRate(){
	
	double monthlyInterestRate = annualInterestRate/1200;
	return monthlyInterestRate;
}	
public double getMonthlyInterest(double monthlyInterestRate){	
	
	//getMonthlyInterestRate();
	double monthlyInterest = balance * monthlyInterestRate;
	
	return monthlyInterest;
	
	
}

}






public class TestAccount {
	public static void main(String [] args){
		
		
		
		
	}
}
