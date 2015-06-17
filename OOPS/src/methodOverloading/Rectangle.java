package methodOverloading;

public class Rectangle {
	
	double length;
	double breadth;
	
	public Rectangle(){
		length = 0;
		breadth = 0;
	}
	
	public Rectangle(double side){
		length = side;
		breadth = side;
	}
	
	public Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea(){
		return length * breadth;
	}
}
