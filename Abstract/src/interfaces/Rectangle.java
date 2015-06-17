package interfaces;

public class Rectangle implements Shape {
	
	double length;
	double breadth;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a Rectangle");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLength() * getBreadth();
	}
	
	public double getLength(){
		return length;
	}
	
	public double getBreadth(){
		return breadth;
	}

}
