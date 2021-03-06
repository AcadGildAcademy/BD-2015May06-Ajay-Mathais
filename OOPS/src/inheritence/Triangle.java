package inheritence;

import java.util.Scanner;

public class Triangle extends Rectangle{

	private static Scanner in;


	public Triangle(double base, double altitude) {
		super(base, altitude);
	}
	
	public double area(){
		return super.area()/2;
	}
	
	
	public static void main(String args[]){
		in = new Scanner(System.in);
		System.out.println("Enter the base : ");
		double base = in.nextDouble();
		System.out.println("Enter the altitude : ");
		double alt = in.nextDouble();
		
		Rectangle rect = new Rectangle(base, alt);
		System.out.println("Rectangle area : " + rect.area());
		
		Triangle tri = new Triangle(base, alt);
		System.out.println("Triangle are : " + tri.area());
		
	}

}
