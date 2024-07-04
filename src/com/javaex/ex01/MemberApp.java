package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member info01 = new Member("jws","정우성",50000);
		Member info02 = new Member("ysj","유재석",30000);
		Member info03 = new Member("lhr","이효리",40000);
		
		System.out.println(info01.showInfo());
		System.out.println(info02.showInfo());
		System.out.println(info03.showInfo());
		
		
	}

}
