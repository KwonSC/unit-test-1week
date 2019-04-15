import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {


    @Test
    public void plus_test() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.add(3,4);
        assertTrue(result == 7);
    }

    @Test
    public void minus_test() {
        CustomCalculator cal = new CustomCalculator();
        int result = cal.subtract(10,2);
        assertTrue(result == 8);
    }

}