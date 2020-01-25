package class12;

public class CountDigit {

	public static void main(String[] args) {
		// Write a program to print number of digit in given number.
		// 12368 - 5 digit
		
		int num1 = 12368 , count=0;
		
		while(num1!=0) {
			num1 = num1 /10;
			count++;
		}
		System.out.println(count);

	}

}
