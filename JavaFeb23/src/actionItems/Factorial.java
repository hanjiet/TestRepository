package actionItems;

public class Factorial {

	public static void main(String[] args) {
	
		int i = 5; // number you want to find  the factorial
		int fac = 1; // number storing result of multiplication
		while (i>0) {
			fac = fac*i;
			i--;
		}
		System.out.println("Factorial of 5 is " +fac);
	}

}
