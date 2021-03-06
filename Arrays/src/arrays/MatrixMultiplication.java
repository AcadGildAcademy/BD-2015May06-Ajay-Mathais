package arrays;

public class MatrixMultiplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		int[][] c = new int[4][4];
		
		//initialization
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				a[i][j] = b[i][j] = i * 4 + j;
				c[i][j] = 0;
			}
		}
		
		display(a);
		System.out.println();
		display(b);
		System.out.println();
		
		// multiply
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				for(int k = 0; k < 4; k++){
					c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				}
			}
		}
		
		//  display
		display(c);
	}
	
	public static void display(int[][] x){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(x[i][j] + "\t");;
			}
			System.out.println();
		}

	}

}
