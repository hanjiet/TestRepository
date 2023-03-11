package array;

public class TwoDArrayNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] my2dArray = new int [2][3];
		
		my2dArray [0][0] = 5;
		my2dArray [0][1] = 6;
		my2dArray [0][2] = 7;
		
		my2dArray [1][0] = 8;
		my2dArray [1][1] = 9;
		my2dArray [1][2] = 10;
		
		System.out.println(my2dArray[1][1]);
		
		System.out.println("Lenght of first array is: "+my2dArray.length);
		System.out.println("Lenght of second array is: "+my2dArray[0].length);
		
		//nested loop
		for(int i=0; i<my2dArray.length; i++){
			for(int j=0; j<my2dArray[0].length;j++){
				System.out.println(my2dArray[i][j]);
			}
		}
		
		
		// another way of declaring 2D array
		int [][] array2 = {{4,56,83},{90, 20, 69}};
		int length = array2.length;
		int length2 = array2[1].length;
		
		
		for(int i=0; i<length; i++){
			for(int j=0; j<length2;j++){
				System.out.println(array2[i][j]);
			}
		}	
	}
}