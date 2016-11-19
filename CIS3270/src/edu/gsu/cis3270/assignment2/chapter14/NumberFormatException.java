package edu.gsu.cis3270.assignment2.chapter14;

public class NumberFormatException {
	public static void main(String[] args){
		
		if(args.length != 1) {
			System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
			System.exit(1);
		}
	
	int result = 0;
	
	String[] tokens = args[0].split(" ");
	try{
		switch (tokens[1].charAt(0)) {
		
			case '+' : result = Integer.parseInt(tokens[0]) +
								Integer.parseInt(tokens[2]);
						break;
			case '-': result =  Integer.parseInt(tokens[0]) -
								Integer.parseInt(tokens[2]);
						break;
			case '*': result =  Integer.parseInt(tokens[0]) *		
								Integer.parseInt(tokens[2]);
						break;
			case '/': result =  Integer.parseInt(tokens[0]) /		
								Integer.parseInt(tokens[2]);
						break;	
		}
	}
	catch (Exception ex){
        System.out.println("Wrong Input " + ex.getMessage());
        System.exit(0);
    }
	
	System.out.println(tokens[0] + ' ' + tokens[1] + ' '
	 + tokens[2] + " = " + result);
	
}

}
