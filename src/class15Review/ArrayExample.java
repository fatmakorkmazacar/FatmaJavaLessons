package class15Review;

public class ArrayExample {

	public static void main(String[] args) {
		// minumum number
		
		int numbers[]= {14,56,37,1,23,9,2,80,67}, min = 0;
		min = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i] < min) {  //for maximum number use >min
				min=numbers[i];
			}
	}
		System.out.println(min);

	}
}


