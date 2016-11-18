package edu.gsu.cis3270.assignment2.chapter11;

public class Student extends Person{
		final String FRESHMAN = "F";
		final String SOPHOMORE ="S";
		final String JUNIOR = "J";
		final String SENIOR = "SR";
			
		String status;
		
		Student(){
			
		}

		Student(String status){
			this.status = status;
		}
		
		@Override
		public String toString(){	
			return "Student " + Person.name + "\n";
		}
}
