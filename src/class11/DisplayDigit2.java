package class11;

import java.util.Scanner;

public class DisplayDigit2 {

	public static void main(String[] args) {
	// DISPLAY DIGIT - 
		
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		
		while(num1 !=0) {
			System.out.println(num1%10);
			num1=num1/10;
		}

	}

}
