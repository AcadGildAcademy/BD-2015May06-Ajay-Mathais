package methodOverriding;

public class Bank {
	String name;
	double rateOfInterest;
	
	public Bank(String name, double rateOfInterest){
		this.name = name;
		this.rateOfInterest = rateOfInterest;
	}
	
	public double getRateOfInterest(){
		return rateOfInterest;
	}

}
