package methodDemo;

public class TestCalculator {

	public static void main(String[] args) {
		//created an object of calculator class
		
		Calculator calc = new Calculator();
		
		System.out.println("67 + 13 is " +calc.doAdd(67, 13));
		System.out.println("83 - 69 is "+calc.doSub(83, 69));
		
		
		System.out.println(calc.concatStr("Hello," , "I am learning Java"));
		
		TestCalculator obj = new TestCalculator();
		System.out.println(obj.doMul(51, 69));
		
		System.out.println(doDiv(10, 2));
		
		obj.sound();
		obj.dogSound();
		
		System.out.println(obj.do3Mul(5, 69, 420));
	}
	
	public int doMul(int a, int b) {
		int c = a*b;
		return c;
	}
	// public static  DO NOT NEED OBJ to call it, can just run, do not need to do obj.doDiv
	public static double doDiv(int a, int b) {
		double c = a/b;
		return c;
		
	}
	
	public void sound() {
		System.out.println("Make some noise");
	}
	
	public void dogSound() {
		sound();
		System.out.println("I can also make dog sound");
	}
	public int do3Mul(int a, int b, int c) {
		int d= a*b*c;
		return d;
	}
	
}
