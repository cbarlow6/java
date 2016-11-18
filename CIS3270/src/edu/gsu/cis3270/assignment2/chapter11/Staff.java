package edu.gsu.cis3270.assignment2.chapter11;

public class Staff extends Employee{
	protected String title;
	
	Staff(){
		
	}
	
	Staff(String title){
		this.title = title;
	}
	@Override
	public String toString(){	
		return "Staff " + Person.name + "\n";
	}
}
