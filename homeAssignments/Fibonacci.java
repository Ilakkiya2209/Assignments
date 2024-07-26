package homeAssignments;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		//0,1
		for (int i = 0; i < 6; i++) {
			// still to print 6 numbers after 0,1
			int num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
			
			
		}

	}

}
