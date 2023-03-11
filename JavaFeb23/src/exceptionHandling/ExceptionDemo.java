package exceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
		System.out.println("Lets us figure out an exception");
		String[] name= {"proSmart", "java","selenium", "eclipse"};
		
		System.out.println(name[4]);
		
		} catch(Exception e) {
			System.out.println("Exception occured! "+ e.getMessage());
			System.out.println("Exception occured! StackTrace message: "+e.getStackTrace());
		
		}
		System.out.println("I am out of the catch block now!");
		
	}

}
