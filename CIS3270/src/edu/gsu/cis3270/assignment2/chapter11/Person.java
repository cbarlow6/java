package edu.gsu.cis3270.assignment2.chapter11;

public class Person {

	static String name;
	static String address;
	static String phone;
	static String emailAddress;
	
	Person(){
		
	}

	Person(String name, String address, String phone, String emailAddress){
		Person.name = name;
		Person.address = address;
		Person.phone = phone;
		Person.emailAddress = emailAddress;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getPhone(){
		return phone;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	@Override
	public String toString(){
		return "Person " + Person.name + "\n";
	}

}
