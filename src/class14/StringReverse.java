package class14;

public class StringReverse {

	public static void main(String[] args) {
		// Reverse this string
		
				String original = "SprintQA"; 
				String reverse= "";
				
				for(int i=original.length()-1;i>=0;i--) {
					reverse=reverse+original.charAt(i);
				}
				System.out.println(reverse);
	}

}
