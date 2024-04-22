package com.march23.DemoMackito23;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class JunitMockitoDemo {
	private Calculator cal;
	@Before
	void setDemo()
	{
		//CREATE OBJECT OF GIVEN CLASS
		cal=mock(Calculator.class);
		when(cal.addition(1, 1)).thenReturn(2);
		when(cal.subtraction(1, 1)).thenReturn(0);
	}
	@Test
	void testAddition()
	{
		//asserteQUALS(EXPECTED ANSER,ACTUAL ANSWER)
		Assertions.assertEquals(2,cal.addition(1, 1));
		verify(cal).addition(1, 1);
	}
	@Test
	void testSubtraction()
	{
		Assertions.assertEquals(0,cal.subtraction(1, 1));
		verify(cal).subtraction(1, 1);
	}

}
