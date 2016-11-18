package edu.gsu.cis3270.assignment2.chapter11;
//import java.util.*;

public class TestPerson {
	public static void main(String[] args){
		//Calendar hired = new GregorianCalendar(2014, 5, 1);
		
		Person person = new Person("Barlow","123 Main St", "770-123-1234",
				"cbarlow6@student.gsu.edu");
		Student student = new Student("status");
		Staff staff = new Staff("Assistant");
		Faculty faculty = new Faculty("8:00", "5:00", "Associate");
		
		Employee employee = new Employee();
		
		System.out.println(person.toString() + student.toString() + employee.toString() +
				staff.toString() + faculty.toString());
		
		
		
		
		
	}
}
