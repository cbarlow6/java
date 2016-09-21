package edu.gsu.cis3270.assignment1.chapter4;



public class Pyramid2 {

public static void main(String[] args){
		
		
		int number = 8;
		int sum = 1;
		
		for(int i = 1; i <= number; i++){
			for (int j = number; j >= 1 ; j--){
		        //System.out.print(j < i ? j + " ": " " + " ");
				
				if  (j <= i){
					
		         
		        	System.out.printf ("%4d", sum);
		        	sum = sum * 2;
		       
		       
		        	
		        }
				else
		        	System.out.print("  " + "  ");
		        
				
			
			}
			//for (int k = 2; k <  i; k++ ){
				//System.out.print(k + " ");
			//int sum2 = sum;
			for (int k = 2; k <=  i; k++ ){
				
			
			System.out.printf ("%4d", sum/4);
				sum = sum/2;
			}
			sum = 1;
			System.out.println();
		}
			
		
	}
	
 
}
	

