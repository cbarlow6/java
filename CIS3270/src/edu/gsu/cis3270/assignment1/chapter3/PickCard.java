package edu.gsu.cis3270.assignment1.chapter3;

public class PickCard {

	public static void main (String [] args){
		
	int card = (int)(1 + Math.random() * 13);
	int number = (int)(Math.random() * 4);
	
		
			
	switch (card) {
	case 1: System.out.print("The card you picked is Ace of " );break;
	case 2: System.out.print("The card you picked is " + card + " of ");break;
	case 3: System.out.print("The card you picked is " + card + " of ");break;
	case 4: System.out.print("The card you picked is " + card + " of ");break;
	case 5: System.out.print("The card you picked is " + card + " of ");break;
	case 6: System.out.print("The card you picked is " + card + " of ");break;
	case 7: System.out.print("The card you picked is " + card + " of ");break;
	case 8: System.out.print("The card you picked is " + card + " of ");break;
	case 9: System.out.print("The card you picked is " + card + " of ");break;
	case 10: System.out.print("The card you picked is " + card + " of ");break;
	case 11: System.out.print("The card you picked is Jack of ");break;
	case 12: System.out.print("The card you picked is Queen of ");break;
	case 13: System.out.print("The card you picked is King of ");
	
	}
	if (number == 0){ 
		System.out.print("Clubs");
		}
		else if(number == 1){
			System.out.print("Diamonds");
		}
		else if (number == 2){
			System.out.print("Hearts");
		}
		else {
			System.out.print("Spades");
		}	
		
	}
}
