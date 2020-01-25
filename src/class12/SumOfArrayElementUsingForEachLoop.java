package class12;

public class SumOfArrayElementUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int salary[] = {2000,5000,1000,500,400,700,600,600,1200,900};
		int sum = 0;
		for (int empSalary:salary) {
			sum =sum+empSalary;}
			System.out.println(sum);
			
		}

	}


