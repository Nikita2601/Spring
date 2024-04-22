import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestJunitDemo4 {
@ ParameterizedTest
@ ValueSource(strings= {"atul","devayani","neha"})
void display(String word) {
	System.out.println(word);

}
@ ParameterizedTest
@ ValueSource(ints= {10,20,30,40})
void display(int word) {
	System.out.println(word);

}

}

