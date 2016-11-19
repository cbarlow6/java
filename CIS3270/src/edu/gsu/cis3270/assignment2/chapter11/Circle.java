package edu.gsu.cis3270.assignment2.chapter11;

public class Circle extends GeometricObject {
	 
		
		private double radius;
		
		public Circle(){
			
		}
		public Circle(double radius){
			this.radius = radius;
		}
		public Circle(double radius, String color, boolean filled){
			this.radius = radius;
			setColor(color);
			setFilled(filled);
		}

		public double getRadius(){
			return radius;
		}
		
		public void setRadius(double radius){
			this.radius = radius;
		}

		public double getArea(){
			return radius * radius * Math.PI;
		}
		public double getPerimeter(){
			return 2 * radius;
		}
		public double getDiameter(){
			return 2 * radius * Math.PI;
		}

	}



