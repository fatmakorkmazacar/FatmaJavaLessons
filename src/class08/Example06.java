package class08;

public class Example06 {

	public static void main(String[] args) {
		// Write a program to find the result
		
		// 1/2+2/3+3/4+...+10/11
		
		double sum=0;
		for (double i=1; i<=10; i++ ) {
          sum= sum+i / (i+1);
	}
		
		 System.out.println(sum);
}	
		
		
	}



