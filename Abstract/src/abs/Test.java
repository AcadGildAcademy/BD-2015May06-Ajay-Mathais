package abs;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricBassGuitar ebs = new ElectricBassGuitar();
		ebs.name = "Electic Bass Guitar";
		ebs.numberOfStrings = 10;
		
		ElectricGuitar egs = new ElectricGuitar();
		egs.name = "Electric Guitar";
		egs.numberOfStrings = 12;
		
		ebs.play();
		egs.play();

	}

}
