import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test
    public void testAdd(){
        assertEquals(30, calculator.Add(10, 20));
    }

    @Test
    public void testSubstract(){
        assertEquals(10, calculator.Substract(20, 10));
    }

    @Test
    public void testMultiply(){
        assertEquals(300, calculator.Multiply(30, 10));
    }

    @Test
    public void testDivide(){
        assertEquals(3, calculator.Divide(30, 10), 0.0);
    }



}
