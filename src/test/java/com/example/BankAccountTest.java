package com.example;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class BankAccountTest {

	private static BankAccount acc = new BankAccount();

	@Test
	public void testCreation() throws InterruptedException {
		assertNotNull(acc);
		Thread.sleep(5000);
	}

	@Test
	public void testBalance() throws InterruptedException {
		assertNotNull(acc.balance());
		Thread.sleep(5000);
	}

	@Test
	public void testWithdraw() throws InterruptedException {
		acc.withdraw(2.0);
		assertTrue(-2.0 == acc.balance());
		Thread.sleep(5000);
	}

	@Test
	public void testDeposit() throws InterruptedException {
		acc.deposit(4.0);
		assertTrue(2.0 == acc.balance());
		Thread.sleep(5000);
	}

}
