package class18;

public class Methods {

	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		
		System.out.println("add " + (num1+num2));
		printLine('*',10); //method call
		System.out.println("sub " + (num1-num2));
		printLine('-',5);
		System.out.println("mul " + num1*num2);
		printLine('~',10);
		System.out.println("div " + (double) num1/num2);
		
	}
	//definition
	public static void printLine(char patternChar, int limit) {
		for (int i=0; i<limit;i++) {
		System.out.print(patternChar);
	}
		System.out.println();
}
}