package entities;

public class Operations {
	
	private int number;
	public String holder;
	private double balance;
	
	

	public Operations(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}



	public Operations(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}



	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}




	public String toString() {
		return "Account "
				+ number
				+ ", Holder "
				+  holder
				+ ", Balance: $"
				+ String.format("%.2f", balance);
		
	}
	
}
