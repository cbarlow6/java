package edu.gsu.cis3270.assignment2.chapter14;

public class BinaryFormatException extends Exception{
	BinaryFormatException() {
		super("Not a binary string");
	}
	BinaryFormatException(String message){
		super(message);
	}
}
