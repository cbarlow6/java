package edu.gsu.cis3270.assignment2.chapter11;
import java.util.*;
public class Employee extends Person {

	String office;
	double salary;
	Date dateHired;
		

Employee(){

}
Employee(String office, double salary, int year){
	this.office = office;
	this.salary = salary;
	dateHired =  new Date(year);
	
}


public String toString(){
	
	return "Employee " + Person.name + "\n";
}
}