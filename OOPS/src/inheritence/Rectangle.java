package inheritence;

public class Rectangle {
	double base;
	double altitude;
	
	public Rectangle(double base, double altitude){
		this.altitude = altitude;
		this.base = base;
	}
	
	public double area(){
		return (base * altitude);
	}

}
