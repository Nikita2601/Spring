import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.After;
import org.junit.AfterClass;


public class TestJunitDemo2 {
@ Test
	public void disp() {
	System.out.println("This is disp method");
}
@ Before
public void accept() {
	/*if expression is true then
	 * test case pass*/
	 assertTrue(12>4);
	 System.out.println("condition for acceptr is true");
}
@ After
public void Accept1() {
	assertFalse(12<4);
	System.out.println("condition for accept is false");
}
@ Test
public void Accept2() {
	/* if value is not mentioned test case will not pass */
	String a="neha";
	assertNotNull(a);
	System.out.println("value of a:"+a);
}
@Test 
public void Accept3() {
	String b=null;
	/*if value is null then test case will pass*/
	assertNull(b);
	System.out.println("value for b:"+b);
}
@ AfterClass
public static void Accept4() {
	String c="1010";
	
	System.out.println(c);
	
}

}
