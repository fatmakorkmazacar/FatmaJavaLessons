package class12;
public class FindLargestNumber {
	public static void main(String[] args) {
		// LARGEST NUMBER
		int numbers[] = {10,35,67,89,45,10,40,60,58,10},maxNumber=0, minNumber=0;
		maxNumber=numbers[0];
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]>maxNumber) {
				maxNumber=numbers[i];
			}}
		System.out.println("Largest number is "+maxNumber);	
		
		//SMALLEST NUMBER
		minNumber=numbers[0];
		for (int i=0;i<numbers.length;i++) {
			if(numbers[i]<minNumber) {
		minNumber=numbers[i];
			}}
		System.out.println("Smallest number is "+minNumber);
		}}

