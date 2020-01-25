package class11;

public class ReverseNumber {

	public static void main(String[] args) {
		// REVERSE NUMBER; 
		
		int num1=123,reverse = 0,lastDigit;
		//3*10+2=32*10+1=321
		while (num1 !=0) {
			lastDigit=num1%10;
			reverse=reverse*10+lastDigit;//3,32,321
			num1=num1/10;	
		}

			System.out.print(reverse);
				

	}

}
