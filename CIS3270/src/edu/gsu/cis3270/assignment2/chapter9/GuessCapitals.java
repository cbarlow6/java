package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class GuessCapitals {
	public  static void main(String[] args){
	
		String [][] capital = {
		{"Alabama", "Montgomery"},{"Alaska", "Juneau"},{"Arizona", "Phoenix"},{"Arkansas", "Little Rock"},		
		{"California", "Sacramento"},{"Colorado","Denver"},{"Connecticut","Hartford"},{"Delaware","Dover"},
		{"Florida","Tallahassee"},{"Georgia","Atlanta"},{"Hawaii","Honolulu"},{"Idaho","Boise"},{"Illinois","Springfield"},
		{"Indiana","Indianapolis"},{"Iowa","Des Moines"},{"Kansas","Topeka"},{"Kentucky","Frankfort"},{"Louisiana","Baton Rouge"},
		{"Maine","Augusta"},{"Maryland","Annapolis"},{"Massachusetts","Boston"},{"Michigan","Lansing"},{"Minnesota","St. Paul"},
		{"Mississippi","Jackson"},{"Missouri","Jefferson City"},{"Montana","Helena"},{"Nebraska","Lincoln"},
		{"Nevada","Carson City"},{"New Hampshire","Concord"},{"New Jersey","Trenton"},{"New Mexico","Santa Fe"},
		{"New York","Albany"},{"North Carolina","Raleigh"},{"North Dakota","Bismarck"},{"Ohio","Columbus"},
		{"Oklahoma","Oklahoma City"},{"Oregon","Salem"},{"Pennsylvania","Harrisburg"},{"Rhode Island","Providence"},
		{"South Carolina","Columbia"},{"South Dakota","Pierre"},{"Tennessee","Nashville"},{"Texas","Austin"},{"Utah","Salt Lake City"},
		{"Vermont","Montpelier"},{"Virginia","Richmond"},{"Washington","Olympia"},{"West Virginia","Charleston"},{"Wisconsin","Madison"},
		{"Wyoming","Cheyenne"}
		};	
	
	String[]answer = new String[50];
	
	Scanner input = new Scanner(System.in);
	
	//System.out.println("Enter the capitals of the states");
	
	for(int row = 0; row < capital.length; row++){
		
		System.out.println("What is the capital of " + capital[row][0]);
		answer[row] = input.nextLine();
		//System.out.println();
		System.out.println("The correct answer should be " + capital[row][1]);
		System.out.println();
		
	}
	
	
	//for(int row = 0; row < answer.length; row++ ){
		//System.out.println("Enter the capital");
		//answer[row] = input.nextLine();
		//System.out.println("The correct answer should be " + capital[row][1]);
	//}
		
		getCapital(capital, answer);
		
		input.close();
	}
	


		public static void getCapital(String[][] capital, String[] answer){
			int count = 0;
			
			for(int i = 0; i < capital.length; i++){
				if(capital[i][1].equalsIgnoreCase(answer[i]))
					count++;
					
			}
			
				
			System.out.println("The correct count is " + count);
	
	
}
}
