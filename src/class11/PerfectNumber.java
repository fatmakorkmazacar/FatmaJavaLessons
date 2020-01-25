package class11;

public class PerfectNumber {

	public static void main(String[] args) {
		// PERFECT NUMBER;sum of divisor except itself.
		// 28=1+2+4+7+14 = This is a perfect number.

		
	int num1=28;
	int sum=0;
		
		for(int i=1;i<num1;i++) {
		
		if(num1%i==0) {
			sum=sum+i;
			
		}

	}
		if(sum==num1) {
		System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
	}
}
