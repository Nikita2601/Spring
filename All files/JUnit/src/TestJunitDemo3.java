import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

public class TestJunitDemo3 {
@ Test
public void  disp() {
	System.out.println("This is disp method");
}
@ RepeatedTest(3)
public void calci() {
	for(int i=1;i<=10;i++) {
		System.out.println(i);
	}
}
}
