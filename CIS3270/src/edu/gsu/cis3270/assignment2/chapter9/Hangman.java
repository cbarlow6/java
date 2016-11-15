package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args){
		
		// word array	
	String[] words = {"morning", "glory", "television", "blue", "lamp", "desk", "window",
			"book", "plant", "tree"};
	String random = words.args((int)Math.random() * 10);
	
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a letter in word " );
	
	String letter = input.next();
	
	for(int i = 0; i < random.length(); i++){
		if(letter == random.charAt(i)){
			
			
		}
		
	}
	
		
	}
}
