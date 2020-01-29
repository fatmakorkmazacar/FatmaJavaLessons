package class18;

import java.util.Scanner;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		// write a definition of function to do sum of two numbers
		//declaring & assigning value to the int variable
		int num1=10, num2=20, result;
		//calling a function with two parameter and taking result into result variable
		result=sum (num1,num2);
		System.out.println(result);
		System.out.println(getUserInput());
	}
	//method to perform addition of two numbers
	public static int sum(int a , int b) {
		return a+b;
		
	}
	//method without parameter and return value
	public static String getUserInput() {
		Scanner sc=new Scanner (System.in);	
		return sc.nextLine();
	}
}