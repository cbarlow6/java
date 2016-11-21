package edu.gsu.cis3270.assignment2.chapter15;

import edu.gsu.cis3270.assignment2.chapter11.Circle;

public class TestComparableCircle{
	public static void main(String[] args){
	ComparableCircle circle1 = new ComparableCircle(25);
	ComparableCircle circle2 = new ComparableCircle(20);
	
	ComparableCircle circle3 = Max.max(circle1, circle2);
	System.out.println("The circle with the largest area has a radius of: " + 
			circle3.getRadius()); // + "\nand area of: " + circle3.getArea());
	System.out.println(circle3);
	}
}
class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

		public ComparableCircle(double radius){
			super(radius);
		}

@Override
public int compareTo(ComparableCircle o){
	if (getArea() > o.getArea())
		return 1;
	else if (getArea() < o.getArea())
		return -1;
	else
		return 0;
	}
	@Override
	public String toString(){
		return super.toString() + "\nArea: " + getArea();
	}
}

class Max { 
	public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2){
		if(c1.compareTo(c2) > 0)
			return c1;
		else
			return c2;
	}
		
}
