package edu.gsu.cis3270.assignment2.chapter15;
//import java.util.Arrays;
import edu.gsu.cis3270.assignment2.chapter11.*;
public class TestSquare {
	public static void main(String[] args){
		GeometricObject[] shapes = new GeometricObject[5];
		shapes[0] = new Square(5);
		shapes[1] = new Square(6);
		shapes[2] = new Square(8);
		shapes[3] = new Square(7);
		shapes[4] = new Square(4);
		
		
		
		for(int i = 0; i < shapes.length; i++){
			if (shapes[i] instanceof Colorable)
				System.out.println((Colorable)shapes[i]);
		
		
		}
				
	}
}
	class Square extends GeometricObject implements Colorable{
		private double side;
		
		public Square(){
			
		}
		
		public Square(double side){
			this.side = side;
			howToColor();
		}
		
		@Override
		public void howToColor() {
			// TODO Auto-generated method stub
			System.out.println("Color all four sides" );
		}
		public double getArea(){
			double area = side * side;
			return area;
			
	}

	
	
	}
