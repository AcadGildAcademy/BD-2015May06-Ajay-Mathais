package interfaces;

public class Test {
	
	public static void main(String[] args){
		Circle circle = new Circle();
		circle.radius = 10.0;
		System.out.println(circle.getArea());
		circle.draw();
		
		Rectangle rect = new Rectangle();
		rect.breadth = 10;
		rect.length = 10;
		System.out.println(rect.getArea());
		rect.draw();
	}

}
