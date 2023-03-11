package actionItems;

public class EvenSum {

	public static void main(String[] args) {
		
		// For Loop
		int sum=0;
		for(int i=20; i<=40; i=i+2) {
			sum = sum + i ;
		}
		System.out.println("For loop: Sum of even numbers from 20 to 40 is "+sum);
		
		// While loop
		int j=20;
		int sum2=0;
		while(j<=40) {
			sum2 = sum2 + j;
			j = j + 2;
		}
		System.out.println("While loop: Sum of even numbers from 20 to 40 is "+sum2);
	}
}
