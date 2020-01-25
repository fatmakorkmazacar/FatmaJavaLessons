package class12;

public class AvgSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary[] = {2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900};
		int sum = 0;

		for(int i=0;i<salary.length; i++) {
			sum = sum + salary[i];
			
		}
		    System.out.println("Total cost : "+sum);
			System.out.println("avgSalary: "+sum/salary.length);
	}
	}


