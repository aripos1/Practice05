package com.javaex.ex06;

public class CConverterApp {

	public static void main(String[] args) {

		double dollar;
		double won;

		CConverter.setRate(1118.70);

		won = CConverter.toDoller(1000000);
		dollar = CConverter.toKWR(100);
		// 100만원을 달러로 출력하기
		System.out.println("백만원은 " + won + "달러입니다.");

		// 100달러를 원으로 출력하기
		System.out.println("백달러는 " + dollar + "입니다.");

	}

}
