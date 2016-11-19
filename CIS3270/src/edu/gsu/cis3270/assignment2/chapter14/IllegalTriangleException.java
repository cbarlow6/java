package edu.gsu.cis3270.assignment2.chapter14;

@SuppressWarnings("serial")
public class IllegalTriangleException extends Exception {
	
	IllegalTriangleException(){
		super("Invalid input. (side1 + side2 = side3)");
	}
	IllegalTriangleException(String message){
		 super(message);
	}
		  

		  

}
