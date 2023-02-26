package dataType;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		/*
		 * ==	is equal
		 * !=	is not equal
		 * >	is greater than
		 * < 	is less than
		 * >=	is greater than or equal
		 * <=	is less than or equal
		 * 
		 */
		int a =15;
		int b =16;
		
		String actual = "Google";
		String expected = "google";
		
		System.out.println(actual==expected); // false
		System.out.println(actual!=expected); // true
		
		System.out.println(a>b); // false
		System.out.println(a<b); // true
		System.out.println(a>=b); //false 
		System.out.println(a<=b); // true
		
		
		
	}

}
