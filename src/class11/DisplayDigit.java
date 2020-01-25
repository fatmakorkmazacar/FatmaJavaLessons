package class11;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
		// DISPLAY DIGIT
		
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		
		
		System.out.println(num1%10); //3
		num1 = num1/10; //15
		
		System.out.println(num1%10); //5
		num1 = num1/10; //1
		
		System.out.println(num1%10);  //1
		num1 = num1/10; //0
	}

}
