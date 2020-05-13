package com.cognizant;

public class Calculator {

	public int multiply(int x, int y) {
		if (x * y == 0) {
			return 1;
		}
		return x * y;
	}

	public double divide(int x, int y) {
		return x / y;
	}
	
	public int factorial(int number) {
		int fact=1;
		for (int i = 1; i < number; i++) {
			fact=fact*i;
		}
		return fact;
	}

}
