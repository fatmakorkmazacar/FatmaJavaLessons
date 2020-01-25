package class12;

public class FindIndexOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[] = {10,35,67,89,45,65,40,60,58,43};
		int targetNumber = 58;
		
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]==targetNumber) {
				System.out.println("40 is stored at position " +i);
				break;
			}
	}

}
}