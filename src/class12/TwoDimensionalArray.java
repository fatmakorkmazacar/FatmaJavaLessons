package class12;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// numbers.lenght - number of rows
		
		int numbers[][] = {{10,20,30},{40,50,60},{70,80,90} };
		
		for (int i = 0; i<numbers.length;i++){ //rows
			for (int j=0;j<numbers[i].length;j++){ //columns
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
