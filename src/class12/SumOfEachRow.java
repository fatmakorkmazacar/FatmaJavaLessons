package class12;

public class SumOfEachRow {

	public static void main(String[] args) {
		// numbers.lenght - number of rows
		
		int numbers[][] = {{10,20,30},{40,50,60},{70,80,90} };
		int sum=0;
		for (int i = 0;i<numbers.length;i++) {
			sum=0; //if we dont write it here the result will be wrong!!!
			for (int j=0;j<numbers[i].length;j++) {
				sum=sum+numbers[i][j];
			}
			System.out.println("Sum of row " +i+" = "+sum);
		}
	
	}
	}




