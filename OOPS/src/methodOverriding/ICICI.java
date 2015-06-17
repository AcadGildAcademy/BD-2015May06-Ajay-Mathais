package methodOverriding;

public class ICICI extends Bank{

	public ICICI() {
		super("ICICI", 7);
		// TODO Auto-generated constructor stub
	}
	
	public double getRateOfInterest(){
		return rateOfInterest;
	}
}
