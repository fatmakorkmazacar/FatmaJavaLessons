package class09;

import java.util.Scanner;

public class NestedForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		int numberOfRow = sc.nextInt();
		int numberOfCol = sc.nextInt();
		for (int i=1; i<=numberOfRow ;i++) {
			
			for (int j=1; j<=numberOfCol;j++) { 
				
		System.out.print("* ");
		
		} 
			System.out.println();
	} 
		
	}
}

