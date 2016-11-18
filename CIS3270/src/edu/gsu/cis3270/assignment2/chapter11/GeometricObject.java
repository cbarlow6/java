package edu.gsu.cis3270.assignment2.chapter11;
import java.util.Date;

public class GeometricObject {
	String color;
	boolean filled;
	Date dateCreated;

	GeometricObject(){
		
	}
	GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}

	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public Date getDateCreated(){
		return dateCreated;
	}

	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
}
