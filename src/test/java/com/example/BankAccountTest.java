package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BankAccountTest {

	private static BankAccount acc = new BankAccount();

	@Test
	public void testBalance() {
		assertNotNull(acc);
		assertTrue(0.0 == acc.balance());
	}

	@Test
	public void testWithdraw() {
		acc.withdraw(2.0);
		assertTrue(-2.0 == acc.balance());

	}

	@Test
	public void testDeposit() {
		acc.deposit(4.0);
		assertTrue(2.0 == acc.balance());
	}

}
