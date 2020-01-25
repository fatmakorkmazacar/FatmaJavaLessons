package class12;

public class OddEvenNumberArray {

	public static void main(String[] args) {
		// Count total number of odd and total number of even number inside the array

		int numbers[] = {12,65,78,1,6,45,71,65,34,89},evenCount=0,oddCount=0;

		for(int i=0;i< numbers.length; i++) {
			
			if (numbers[i] % 2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Total num of even : "+ evenCount);
		System.out.println("Total num of odd : "+ oddCount);
		}
	}


