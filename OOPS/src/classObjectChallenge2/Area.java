package classObjectChallenge2;

import java.util.Scanner;

public class Area {

	/**
	 * @param args
	 */
	double radius;
	double area;
	private static Scanner in;
	
	public Area(double radius){
		this.radius = radius;
		area = 3.14 * radius * radius;
	}
	
	public double getArea(){
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		in = new Scanner(System.in);
		double rad = in.nextDouble();
		Area circle = new Area(rad);
		System.out.println(circle.area);
	}

}
