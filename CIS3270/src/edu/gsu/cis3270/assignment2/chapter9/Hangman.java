package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class Hangman {
	public static void main(String[] args){
		
		// word array	
	String[] words = {"morning", "glory", "television", "blue", "lamp", "desk", "window",
			"book", "plant", "tree"};
	//char replay = 'y';
	String answer = "yes";
	do{
	String random = words[(int)(Math.random() * 10)];
	
	String display = random.replaceAll(".", "*");
	System.out.println(display);
	char[] display1 = display.toCharArray();
	
	Scanner input = new Scanner(System.in);
	char [] chars = random.toCharArray();
	
	int missed = 0;
	int count = 0;
	int match = 0;
	int tracker = 0;
	while(count < 9){
		
	
	System.out.println("(Guess) Enter a letter in word " );
	String guess = input.nextLine();
	
	for(int j = 0; j < display1.length; j++){
		char charGuess = guess.charAt(0);
		if(charGuess == display1[j]){
			System.out.println(charGuess + " is already in the word");
			System.out.println("(Guess) Enter a letter in word " );
			guess = input.nextLine();
		}
	}
	
	
	
	//for(int j = 0; j < random.length(); j++)
	for(int i = 0; i < random.length(); i++){
		char charGuess = guess.charAt(0);
		if(charGuess == chars[i]){
			display1[i] = charGuess;
			match++;
			tracker++;
		}
	}	
		if(tracker == 0){
			char charGuess = guess.charAt(0);
			System.out.println(charGuess + " is not in the word");
			missed++;		
		}
		
		if(match == random.length()){
			//System.out.println("The word is " + random);
			break;
		}
		else
			for(char u: display1){
				System.out.print(u);
				//System.out.println();
		}
	tracker = 0;
	count++;
	
	}
	System.out.println();
	System.out.println("Game Over. The word is "+ random + " You missed "+ missed);
	System.out.println("Do you want to guess another word? Enter yes or no");
	
	answer = input.next();
	//replay = answer.charAt(0);
	
	}while (answer.equalsIgnoreCase("yes"));
	
	//System.exit(0);
	
	//input.close();
	}
}
	

