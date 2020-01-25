package class15Review;

public class LogicalProgram {

	public static void main(String[] args) {
		// Check given number is PRIME or NOT
		
		int num1 = 2; //2 3 4 5 6 7 8 9 10 11 12 13 14 
		boolean flag = false;
		for (int i = 2; i<= num1-1; i++) {

			if(num1 % i==0) {
				flag = true;
				System.out.println("Number is not prime");
				break;
			}
	}
		if (flag==false) {
			System.out.println("Number is prime");
		}
		
}
}



