import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore;

public class TestJunitDemo1 {
@ Test
public void Show() {
	String name="nikita";
	assertEquals("nikita",name);
	System.out.println("Name is:"+name);
}
@ Before
public void add()
{
	int a=10,b=20;
	System.out.println("Addition is :"+(a+b));
}
@ After
public void sub() {
	int a=5,b=20;
	System.out.println("subtraction is :"+(a-b));
}
@ Ignore
public void Mul() {
	int a=3,b=4;
	System.out.println("multiplication is :"+(a*b));
}
}
