package class11;

public class PrimeNumber {
	public static void main(String[] args) {
		/* PRIME NUMBER; Is the given number prime or not?
		 * Prime number - if a number is divisible by only and only 1 and itself.
		 * NOT PRIME - if we found any number that divides current number */
		
		int num1 = 13; //2 3 4 5 6 7 8 9 10 11 12 13 14 
		int i;
		for ( i = 2; i<num1; i++) {
			if(num1 % i == 0) {
				System.out.println("Number is not prime");
				break;
			}
		}
		if (i==num1) {
			System.out.println("Number is prime");
		}
		
	

}
}