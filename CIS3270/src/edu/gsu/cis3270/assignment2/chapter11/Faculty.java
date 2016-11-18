package edu.gsu.cis3270.assignment2.chapter11;

public class Faculty extends Employee{
	
	final String PROFESSOR = "P";
	final String  ASSOCIATE = "A";
	
	String startHour;
	String endHour;
	String rank;
	
	Faculty(){
		
	}

	Faculty(String startHour, String endHour, String rank){
		this.startHour = startHour;
		this.endHour = endHour;
		this.rank = rank;	
	}
	
	@ Override
	public String toString(){
		return "Faculty " + Person.name + "\n";
	}
}
