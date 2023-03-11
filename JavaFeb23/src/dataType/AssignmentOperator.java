package dataType;

public class AssignmentOperator {

	public static void main(String[] args) {
		/*
		 * Assignment Operators are =, +=, -=, *=, /=, %=
		 * 
		 * a = 7 meaning a = 7
		 * a+= 7 meaning a = a+7
		 * a-= 7 meaning a = a-7
		 * a*= 7 meaning a = a*7
		 * a/= 7 meaning a = a/7
		 * a%= 7 meaning a = a%7
		 * 
		 */
		int a= 87;
		int r= a/=7;
		System.out.println(a+=7); //94
		System.out.println(a-=7); // 87
		System.out.println(a*=7); // 609
		System.out.println(r); // 12
		System.out.println(a%=7); // 3
		
		
		//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 
	}

}
