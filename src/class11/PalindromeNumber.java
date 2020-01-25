package class11;

public class PalindromeNumber {

	public static void main(String[] args) {
		// PALINDROME NUMBER
		
		int num1=12321, reverse=0,lastDigit,backofnum1=num1;
		
		while (num1!=0) {
			lastDigit=num1%10;
			reverse=reverse*10+lastDigit;
			num1=num1/10;
				
		}
			if(reverse==backofnum1) {
				System.out.print("Palindrome");
			}else {
				System.out.print("Not Palindrome");
				}

	}

}
