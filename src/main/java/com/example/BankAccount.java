package com.example;

public class BankAccount {

	private double balance;

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance -= value;
	}

	public double balance() {
		return this.balance;
	}
}
