package edu.gsu.cis3270.assignment2.chapter8;
class Rectangle{

	double width;
	double height;
	
Rectangle(){
	width = 1;
	height = 1;
	
}

Rectangle(double newWidth, double newHeight){
	width = newWidth;
	height = newHeight;	
}
	double getArea(){
		return width * height;	
	}
	double getPerimeter(){
		return 2 * (width + height);
	}

}	

public class TestRectangle {
	public static void main(String [] args){
		
	Rectangle rec1 = new Rectangle(4, 40);
	Rectangle rec2 = new Rectangle(3.5, 35.9);
	
	System.out.println("Width for rec1 is " + rec1.width);
	System.out.println("Width for rec2 is " + rec2.width);
	
	System.out.println("Height for rec1 is " + rec1.height);
	System.out.println("Height for rec2 is " + rec2.height);
	
	System.out.println("Area for rec1 is " + rec1.getArea() 
						+ "\nPerimeter for rec1 is " + rec1.getPerimeter());
	System.out.println("Area for rec2 is " + rec2.getArea() 
						+ "\nPerimeter for rec2 is " + rec2.getPerimeter());
			
		
	}
	
	
}
