package methodOverriding;

public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		System.out.println("SBI Interest : " + sbi.getRateOfInterest());
		
		ICICI icici = new ICICI();
		System.out.println("ICICI Interest : " + icici.getRateOfInterest());
		
		Axis axis = new Axis();
		System.out.println("Axis Interest : " + axis.getRateOfInterest());

	}

}
