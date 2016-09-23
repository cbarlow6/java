package edu.gsu.cis3270.assignment1.chapter4;

public class CalculateE {

	public static void main(String[] args){
		
		int number = 1000;
		//double sum = 0;
		//for(int i = 1;i<= number; i++){
		while(number<=10000){	
			
			double e = Math.pow((1 + 1/number), number);
			System.out.println("n is: " + number + " and " + "e is: " + e );
			number = number + 1000;
			//sum = sum + e;
			
		}
		//System.out.print(sum);
	}
}
