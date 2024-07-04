package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account() {

	}

	public Account(String accountNo) {
		System.out.println(accountNo + " 계좌가 개설 되었습니다.");
	}

	// gs
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 필요한 메소드 작성

	public int deposit(int money) {
		balance = balance + money;
		return balance;
	}

	public int withdraw(int money) {
		balance = balance - money;
		return balance;
	}

	public void showBalance() {

		System.out.println(balance);
	}

}
