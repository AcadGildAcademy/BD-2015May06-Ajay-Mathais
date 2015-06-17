package methodOverloading;

import java.util.Scanner;

public class Square extends Rectangle{
	
	public Square(){
		super();
	}
	
	public Square(double side){
		super(side);
	}

	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length");
		double length = in.nextDouble();
		System.out.println("Enter the breadth");
		double breadth = in.nextDouble();
		Rectangle rect = new Rectangle(length, breadth);
		System.out.println("Area of the rectangle is : " + rect.getArea());
		
		System.out.println("Enter the side");
		double side = in.nextDouble();
		Square sq = new Square(side);
		System.out.println("Area of the square is : " + sq.getArea());
	}
}
