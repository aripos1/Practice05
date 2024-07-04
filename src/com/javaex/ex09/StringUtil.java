package com.javaex.ex09;

public class StringUtil {

	public static String concatString (String[] strArray) {

		String str = ""; // 빈 공간으로 초기화
		for(int i = 0; i < strArray.length; i++) {
			
			str += strArray[i]; // strArray 의 받는 순서대로 입력
			
		}
		return str; // 계산이 완료 된 후 결과 값
	}

}
