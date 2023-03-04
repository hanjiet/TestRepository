package AI1;

public class AI1 {

	public static void main(String[] args) {
		
//		String name = "Bob";
//		String city = "Bob City";
//		String age = "69";
//		String college = "Bob College";
//		String profession = "Bobber";
//		String animal = "bobby";
//		String petName = "Bobs";
//		
//		System.out.println("Once there was a person named "+ name+ " who lived in "+city+
//				".\nAt the age of "+age+", "+name+" went to college at " +college+ "."
//				+ "\n" +name+ " graduated and went to work as a " +profession+ "."
//				+ "\nThen, " +name+ " adopted a " +animal+ " named " +petName+ ".");
		
	
		
		System.out.println("\nFor Loop: ");
		int sum1 = 0;
		for (int i = 0; i < 16; i++) {
			sum1 += i;
		}
		System.out.println("The sum of the numbers from 0 to 15 is " +sum1);
		
		System.out.println("\nWhile Loop: ");
		int j = 0;
		int sum2 = 0;
		while (j < 16) {
			sum2 += j;
			j++;
		}
		System.out.println("The sum of the numbers from 0 to 15 is " +sum2);
		
		System.out.println("\nDo While Loop: ");
		int k = 0;
		int sum3 = 0;
		do { sum3 += k;
			k++;
		}while (k <16);
		System.out.println("The sum of the numbers from 0 to 15 is " +sum3);
		//testing
	}

}
