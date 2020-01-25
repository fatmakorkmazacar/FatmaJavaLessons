package class12;

import java.util.Scanner;

public class ArrayDeclarationAndInitialization2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numbers[] = new int[5];	
			Scanner sc=new Scanner(System.in);
			
			numbers[0]=sc.nextInt();
			numbers[1]=sc.nextInt();
			numbers[2]=sc.nextInt();
			numbers[3]=sc.nextInt();
			numbers[4]=sc.nextInt();
			
			for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
			
			}	
			
			
	}

}
