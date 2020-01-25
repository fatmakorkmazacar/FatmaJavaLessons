package class11;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// ARMSTRONG NUMBER- 
		//num1 = 173
		//1^3+7^3+3^3=173
		
		int num1=153,sum=0,lastDigit,backOfNum1 = num1;
		while(num1 !=0) {
		lastDigit = num1%10;
		sum=sum+lastDigit*lastDigit*lastDigit;
		num1=num1/10;
		}
		System.out.println(sum);
		System.out.println(backOfNum1);
		if (sum==backOfNum1) {
		System.out.println("Number is armstrong");
		}else {
		System.out.println("Number is not armstrong");
	}
	}
}
