package unit.tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithOneArgumentReturnsOne() {
        test(1, 1);
    }

    @Test
    public void testSumWithThreeArgumentReturnsSix() {
        test(6, 3);
    }

    @Test
    public void testSumWithZeroArgumentThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

    private void test(int expected, int number) {
        long actual = calculator.sum(number);

        Assertions.assertEquals(expected, actual);
    }
}