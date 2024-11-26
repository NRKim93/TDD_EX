package tdd_2024_11_26.SimpleCalculator;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("덧셈")
    public void TestPlus() {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.Plus(2,3);

        assertEquals(5, rs);
    }

    @Test
    @DisplayName("곱셈")
    public void TestMultiple() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.Multiple(2,3);

        assertThat(rs).isEqualTo(6);
    }

    @Test
    @DisplayName("뺄셈")
    public void TestMinus() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.Minus(3,2);
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("나눗셈")
    public void TestDivide() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.Divide(4,2);

        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("나머지")
    public void TestReminder() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.Reminder(3,2);

        assertThat(rs).isEqualTo(1);
    }
}
