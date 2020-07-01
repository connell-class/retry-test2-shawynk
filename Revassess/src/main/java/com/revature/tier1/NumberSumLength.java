package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String strNum = String.valueOf(num);
		Double sum = 0.0;
		for (int i = 0; i < strNum.length(); i++) {
			sum += Math.pow(Integer.parseInt(strNum.substring(i, i+1)),strNum.length());
		}
		return sum.longValue() == num;
	}
}
