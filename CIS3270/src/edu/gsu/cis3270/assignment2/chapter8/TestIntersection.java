package edu.gsu.cis3270.assignment2.chapter8;
import java.util.Scanner;

public class TestIntersection {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the endpoints of the first line segment: (x1, y1, x2, y2)");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println("Enter the endpoints of the second line segment: (x3, y3, x4, y4)");
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		Intersection line1 = new Intersection(x1, y1, x2, y2);
		Intersection line2 = new Intersection(x3, y3, x4, y4);
		
		
		double divisor = line1.getA() * line2.getB() - line2.getA() * line1.getB();
		
		 if (divisor == 0) {
		      System.out.println("The equation has no solution");
		    }
			      
			else { 
				double x = (line2.getB() * line1.getC() - line1.getB() * line2.getC()) / divisor;
				double y = (line1.getA() * line2.getC() - line2.getA() * line1.getC()) / divisor;
			  
		      System.out.println("The intersecting point is: (" + x +", "+ y +")");
			 }
		  input.close();
		  }
		
	}

class Intersection{
	
	private double x1;
	private double y1;
	private double x2;
	private double y2;


	Intersection(double x1, double y1,  double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;	
		this.x2 = x2;
		this.y2 = y2;
		
	}
	
	public double getA(){
		return y2 - y1;
	}	
	
	public double getB(){
		return x1 - x2;
	}
		
	
	public double getC(){
		double C = getA() * x1 + getB() * y1;
		return C;
		
	}
	
	

}