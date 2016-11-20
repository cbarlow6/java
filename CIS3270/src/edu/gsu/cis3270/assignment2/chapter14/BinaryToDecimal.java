package edu.gsu.cis3270.assignment2.chapter14;
import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
	    // Prompt the user to enter a string
	    
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a binary number string: ");
	    String s = input.nextLine();
	    try {
			System.out.println("The decimal value is " + binaryToDecimal(s));
		} catch (BinaryFormatException ex) {
			System.out.println(ex.getMessage());
			// TODO Auto-generated catch block
			//ex.printStackTrace();
		}
	    
	    input.close(); 
	}

	  public static int binaryToDecimal(String binaryString) throws BinaryFormatException{
		  int value = binaryString.charAt(0) - '0';
		  
		  //for(int i = 0; i < binaryString.length(); i++)
		  if(value != '1'  || value != '0')
			  throw new BinaryFormatException();
		  
		  
	    for (int i = 1; i < binaryString.length(); i++) {
	      value = value * 2 + binaryString.charAt(i) - '0';
	    }

	    return value;
	   
	    
	  }
	  
}
