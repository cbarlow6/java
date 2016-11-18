package edu.gsu.cis3270.assignment2.chapter11;
import java.util.Scanner;
public class TestTriangle {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter three sides of triangle:");
	double side1 = input.nextDouble();
	double side2 = input.nextDouble();
	double side3 = input.nextDouble();
	
	System.out.println("Enter color: ");
	String color = input.next();
	
	
	
	System.out.println("Is the triangle filled? Indicate true or false");
	boolean filled = input.nextBoolean();
	
	Triangle tri1 = new Triangle(side1, side2, side3);
	//System.out.println(tri1.toString());
	
	tri1.setColor(color);
	tri1.setFilled(filled);
	System.out.println("Area " + tri1.getArea() + "\nPerimeter " + tri1.getPerimeter());
	System.out.println("Color " + tri1.color + "\nFilled? " + tri1.filled);
	
	
	input.close();
	}
}

class Triangle extends GeometricObject{
	
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;	
	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	public double getSide3(){
		return side3;
	}
	
	public double getArea(){
		double s = (side1 + side2 + side3)/2;
		System.out.println(toString());
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		//System.out.println(s);
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		
		return perimeter;
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
		
	}
	//public void setColor(String color){
	//	super.color = color;
	//}
	
}