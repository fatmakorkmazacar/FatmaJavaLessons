package class15Review;

public class StringExample {

	public static void main(String[] args) {
		// HOMEWORK - find the frequency of given character
		
		String str = "This is string program we learning from java concept";
		char c = 't';
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
		if (str.toLowerCase().charAt(i)==c || str.toUpperCase().charAt(i)==c) {
			count++;
		}}
		System.out.println(count);
	}

}
