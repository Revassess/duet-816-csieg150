package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		String number = String.valueOf(num);
		int length = number.length();
		int sum = 0;
		for(int i = 0; i < number.length(); i++) {
			String digitAtI = String.valueOf((number.charAt(i)));
			int value = (int) Math.pow(Double.parseDouble(digitAtI), length);
			sum += value;
		}
		if(sum == num) {
			return true;
		}
		return false;
	}
}
