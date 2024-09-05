import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
   void testAdd() {
        var calculator = new SimpleCalculator();
        assertEquals(3,calculator.add(1, 2));
    }

}