package class20;

import java.util.Scanner;

public class Greetings {
	
	public static void greetUser (String userName) {
	
		System.out.println ("Hello, " + userName+ "!");
}
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String userName=scanner.next();
		greetUser (userName);
	}	
	}