package class11;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// SUM OF DIGIT
		//Write a program to take number from user and
		//print sum of digit.
		
		
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int sum=0, lastDigit;
		
		
		while(num1 !=0) {
			lastDigit = num1%10;
			sum=sum+lastDigit;
			num1=num1/10;
		}
		System.out.println(sum);

	}

}
