package class18;
public class SumOfDigit {
	public static void main(String[] args) {
		
			sumOfDigits(1520);
			System.out.println();
			}
		 public static void sumOfDigits (int number) {
			 int lastDigit, sum=0;
			 while (number != 0) {
					lastDigit = number % 10;
					sum = sum + lastDigit;
					number = number / 10;		
				}	
				System.out.print(sum);

	}

}
