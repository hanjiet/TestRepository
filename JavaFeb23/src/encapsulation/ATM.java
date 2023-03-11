package encapsulation;

public class ATM {

	public static void main(String[] args) {

		bank obj = new bank();
	//	obj.pinNumber = 6754;
		obj.updatePin(123456789, 1234, 6754);
		obj.drawMoney(123456789, 6754, 5000);
	
		
	}

}
