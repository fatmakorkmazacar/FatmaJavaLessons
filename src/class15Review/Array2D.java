package class15Review;

public class Array2D {

	public static void main(String[] args) {
		// Transpose of matrix
		// 1 4 7
		// 2 5 8 
		// 3 6 9

		int num[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[j][i]+" ");
			}
			System.out.println();
		}
	}

}
