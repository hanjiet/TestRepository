package encapsulation;

public class bank {

	int accountNumber = 123456789;
	int pinNumber = 1234;
	double balance = 150000;

	public void drawMoney(int accNo, int pinNo, int amount) {

		if (accNo == accountNumber && pinNo == pinNumber) {

			if (amount <= balance) {

				balance = balance - amount;
				System.out.println("Amount withdrawn : " + amount);

			} else {
				System.out.println("Insufficient balance");
			}

		} else {
			System.out.println("Invalid credentials");
		}
	}

	public void updatePin(int accountNo, int oldPin, int newPin) {
		if (accountNo == accountNumber && oldPin == pinNumber) {
			pinNumber = newPin;
			System.out.println("Pin is updated");
		} else {
			System.out.println("Invalid credentials");
		}
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
