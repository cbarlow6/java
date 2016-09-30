package edu.gsu.cis3270.assignment1.chapter5;

public class Craps {
	public static void main(String [] args){
		
	int dice1 = 1 + (int)(Math.random() * 6);
	int dice2 = 1 + (int)(Math.random() * 6);
	
	craps(dice1,dice2);	
		
	}
	public static void craps( int dice1,int dice2){
		int sum = dice1 + dice2;
		System.out.println("You rolled " + dice1 + " + "+ dice2 + " = " + sum);
		
			// roll of 2 ,3 or 12
			if(sum == 2 || sum == 3 || sum == 12){
				System.out.println("You lose");
			}
		
			// roll of 7 or 11
			else if (sum == 7 || sum == 11){
			System.out.println("You win");
			}
		
			// roll of 4, 5, 6, 8, 9, 10
			else{
				int point = sum;
			
				System.out.println("Point is " + point);
				do{
					dice1 = 1 + (int)(Math.random() * 6);
					dice2 = 1 + (int)(Math.random() * 6);		
			
				sum = dice1 + dice2; 
				} while( sum != 7 && sum != point);
				
				System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
				
				if (sum == 7){
					System.out.println("You lose");
				}
			
				else {
					System.out.println("You win");
				}
				
		}
					
	}
}
