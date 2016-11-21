package edu.gsu.cis3270.assignment2.chapter14;
import java.util.Scanner;
import edu.gsu.cis3270.assignment2.chapter11.GeometricObject;
public class TestTriangle2 {

    public static void main(String[] args) throws IllegalTriangleException{
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        //Triangle tri2 = null;
        
        Scanner input = new Scanner(System.in);
        
        
            System.out.println("Enter three sides of triangle:");
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();
        
        
        try {
        	new Triangle(side1, side2, side3);
        }
        catch (IllegalTriangleException ex) {
        	System.out.println(ex.getMessage());
        	System.exit(0);
        }
        
        Triangle tri1 = new Triangle(side1, side2, side3);
        
        System.out.println("Enter color: ");
        String color = input.next();
        
       System.out.println("Is the triangle filled? Indicate true or false");
       boolean filled = input.nextBoolean();
        
        
        //Triangle tri1 = tri2;
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
    
    public Triangle() throws IllegalTriangleException{
        //this(1.0, 1.0, 1.0);
    }
    
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
    	setSides(side1,side2, side3);
        //	throw new IllegalTriangleException("Wrong input");
       // this.side1 = side1;
       // this.side2 = side2;
        //this.side3 = side3;
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
    public void setSides( double s1, double s2, double s3) throws IllegalTriangleException{
    	if(s1 + s2 != s3){
    		this.side1 = s1;
    	    this.side2 = s2;
    	    this.side3 = s3;
    	}
    	else
    		throw new IllegalTriangleException();
    	//System.out.println();
        	
        	//System.exit(0);
    	
    	
    }
    public double getArea(){
        double s = (side1 + side2 + side3)/2;
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
       
}

