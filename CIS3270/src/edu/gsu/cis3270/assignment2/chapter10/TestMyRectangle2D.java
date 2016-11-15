package edu.gsu.cis3270.assignment2.chapter10;

public class TestMyRectangle2D{
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
	
	System.out.println("Area " + r1.getArea() + "\nPerimeter " + r1.getPerimeter());
	
	if(r1.contains(3, 3)){
		System.out.println("The rectangle contains point");
	}
		else{
			System.out.println("The rectangle does not contain point");
		}
	
	if(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))){
		System.out.println("The rectangle contains rectangle");
	}
		else{
			System.out.println("The rectangle does not contain rectangle");
		}
	
	if(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4))){
		System.out.println("The rectangle overlaps rectangle");
	}
		else{
			System.out.println("The rectangle does not overlap rectangle");
		}
	}
}


class MyRectangle2D {
	
	double x;
	double y;
	double width;
	double height;
	
	
	MyRectangle2D(){
		x = 0;
		y = 0;
		width = 1;
		height = 1;
		
	}
	 
	MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
	}
	
	
	public double getArea(){
	double area = width * height;
				
	return area;
	}

	public double getPerimeter(){
		double perimeter = 2 * (width + height);
		return perimeter;
	
}
	public boolean contains(double x, double y){
		boolean result = false;
		
		double xmax = getX() + getWidth() / 2;
		double xmin = getX() - getWidth() / 2;
		double ymax = getY() + getHeight() / 2;
		double ymin = getY() - getHeight() / 2;
		
		if(xmax > x && x > xmin && ymax> y && y > ymin)
		result = true;
		
		return result;
	}
	
	public boolean contains(MyRectangle2D r){
		boolean result = false;
		
		double xmax = getX() + getWidth() / 2;
		double xmin = getX() - getWidth() / 2;
		double ymax = getY() + getHeight() / 2;
		double ymin = getY() - getHeight() / 2;
		
		double rXmax = r.x + r.width / 2;
		double rXmin = r.x - r.width / 2;
		double rYmax = r.y + r.height / 2;
		double rYmin = r.y - r.height / 2;
		
		//System.out.println(xmax + "," + getX() + "," + getY() + "," + getWidth() + "," + getHeight());
		//System.out.println(rXmax + "," + r.x + "," + r.y + "," + r.width + "," + r.height);
		//System.out.println(xmin + "," + ymax + "," + ymin);
		//System.out.println(rXmin + "," + rYmax + "," + rYmin);
		
		
		
		if(xmax > rXmax && rXmax > xmin && ymax > rYmax && rYmax > ymin 
			&& xmax > rXmin && rXmin > xmin && ymax > rYmin && rYmin > ymin){
			result = true;
		}
		
		
		return result;
	}
	
	public boolean overlaps(MyRectangle2D r){
		double xmax = getX() + getWidth() / 2;
		double xmin = getX() - getWidth() / 2;
		double ymax = getY() + getHeight() / 2;
		double ymin = getY() - getHeight() / 2;
		
		double rXmax = r.x + r.width / 2;
		double rXmin = r.x - r.width / 2;
		double rYmax = r.y + r.height / 2;
		double rYmin = r.y - r.height / 2;
		
		if(xmax > rXmax && rXmax > xmin && ymax > rYmax && rYmax > ymin 
			|| xmax > rXmin && rXmin > xmin && ymax > rYmin && rYmin > ymin){
			return true;
		}
			else
				return false;
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}




	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}




	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}




	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}




	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}




	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}




	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}




	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

}
