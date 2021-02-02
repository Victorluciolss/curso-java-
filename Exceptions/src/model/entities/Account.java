package model.entities;

import model.exception.DomainException;

public class Account {

	private Integer nuber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;

	public Account(Integer nuber, String holder, Double balance, Double withdrawLimit) {
		super();
		this.nuber = nuber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNuber() {
		return nuber;
	}

	public void setNuber(Integer nuber) {
		this.nuber = nuber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		balance -= amount;
	}

}
