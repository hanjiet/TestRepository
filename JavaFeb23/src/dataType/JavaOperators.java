package dataType;

public class JavaOperators {

	public static void main(String[] args) {
		/**
		 * 
		 * There are 5 types of java operators
		 * 
		 * Arithmetic Operators
		 * Assignment
		 * Comparison/Relational Operators
		 * Logical Operators
		 * Bitwise Operators
		 * 
		 * 
		 */
		// Learning Arithmetic Operators 
		// They are + , - , * , /, %, ++, --

		int a = 10;
		int b = 5;
		int result;
		
		result = a+b;
		System.out.println("Addition result is " + result);// 15
		result = a-b;
		System.out.println("Subtraction result is " + result);// 10
		result = a*b;
		System.out.println("Multiplication result is " + result);// 50
		result = a/b;
		System.out.println("Division result is " + result);// 2
		result = a%b;
		System.out.println("Modulus  result is " + result);// 0 //what is the remainder 
	
	
		System.out.println("Incremental a is " + a++);// 10
		
		System.out.println("Decremental a is " + a--);//
		
	}

}
