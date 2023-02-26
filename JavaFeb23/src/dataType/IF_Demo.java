package dataType;

public class IF_Demo {

	public static void main(String[] args) {
		/*
		 * 
		 * Syntax:
		 * if(boolean condition)
		 *	{ 
		 *		code to be executed
		 *	}
		 * 
		 */
		
		int age = 16;
		System.out.println("Testing if conditon starts: ");
		
			if(age > 18) {
				System.out.println("You are eligibile to drink");
			}
			else System.out.println("You are not eligible to drink");
			System.out.println("Testing if condition ends");
	}

}
