package edu.gsu.cis3270.assignment1.chapter3;
import java.util.Scanner;

public class PointInCircle {

	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter two point on a circle:");
	
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	
	double x2 = 0;
	double y2 = 0;
	
	
	double d = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), .5);
	
	if(d <= 10){
		System.out.println("Point " + x1 + " , " + y1 + " is in the circle");
	}
	else{
		System.out.println("Point " + x1 + " , " + y1 + " is not in the circle");
	}
	
	input.close();
	
		
	}
}
