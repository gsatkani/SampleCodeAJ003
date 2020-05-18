package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock; 
import static org.mockito.Mockito.when;  



import com.cognizant.Calculator;

public class CalculatorTest {

	@Before
	public void abc() {
		
	}

	@Test
	public void testMultiply() {
		
		Calculator mock2 = mock(Calculator.class);
		
		when(mock2.divide(10, 5)).thenReturn(2.00);
		when(mock2.divide(Mockito.anyInt(),Mockito.anyInt())).thenReturn(2.00);
		
		
		
		Calculator cal = new Calculator();
		assertEquals(10, cal.multiply(2, 5));
		assertEquals(1, cal.multiply(10, 0));

	}

	@Test(expected = ArithmeticException.class)
	public void testDivide() {
		Calculator cal = new Calculator();
		assertEquals(3.33, cal.divide(10, 3), 2);
		assertEquals(0, cal.divide(10, 0), 0);

	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testFactorial() {
		Calculator cal = new Calculator();
		assertEquals(120, cal.factorial(5));
		assertEquals(1, cal.factorial(1));
		assertEquals(1, cal.factorial(0));
		assertEquals(0, cal.factorial(-5));
	
	}
}
