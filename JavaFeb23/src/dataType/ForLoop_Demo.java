package dataType;

public class ForLoop_Demo {

	public static void main(String[] args) {
	
	/*
	 * for(start point, end point, how will it increment)
	 * { 
	 * code to be executed
	 * }
	 * 
	 * Syntax for while loop
	 * initialization;
	 * while(condition){
	 *	// Statement 
	 *	increment/decrement
	 *	}
	 *
	 * Syntax for do while loop
	 * initialization;
	 * do{
	 *  // statement 
	 *  increment/decrement
	 *  } while (condition)
	 * 
	 * 
	 * Type I am from + variable 3 times using for, while, and do while loop
	 * Use string variable for referring to your place
	 */
	
	for(int i=1; i<=10; i++) {
		System.out.println("I love you");
		}
	System.out.println( "\nWhile Loop:");
	int j = 1;
	String q= "Queens";
	while (j < 4) {
		System.out.println("I am from " + q );
		j++;
	} 
	
	System.out.println("\nDo While Loop: ");
	int k =1;
	do {
		System.out.println("I am from " +q);
		k++;
	}while (k<4);
	
	
	}

}
