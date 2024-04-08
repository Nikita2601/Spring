package test.java.com.edubridge.mokitodemo1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import com.edubridge.mokitodemo.Calculator;

public class JunitMokitoDemo {
 private Calculator cal;
 @ BeforeEach
 void setDemo() {
	 cal=mock(Calculator.class);
	 when(cal.addition(1, 1).thenReturn(2));
	 when(cal.subtraction(1, 1).thenReturn(0));
	 @ Test
	 void testAddition() {
		 Assertions.assertEquals(2,cal.addition(1, 1));
		 verify(cal).addition(1,1);
	 }
	 @ Test
	 void testSubtraction() {
		 Assertions.assertEquals(0,cal.subtraction(1, 1));
		 verify(cal).subtraction(1,1);
	 }
	 
 }
private Calculator mock(Class<Calculator> class1) {
	// TODO Auto-generated method stub
	return null;
}

}

