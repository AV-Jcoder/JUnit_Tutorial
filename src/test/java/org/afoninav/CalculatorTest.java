package org.afoninav;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Multiplication")
    void testMultiply() {
        assertEquals(20, calc.multiply(4,5), "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calc.multiply(0,5),"Multiply with zero should by zero");
        assertEquals(0, calc.multiply(5,0),"Multiply with zero should by zero");
    }

    @Test
    @DisplayName("Divide by zero")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1,0),"Fail. Divide by zero throw exactly.");
    }

    @Test
    @DisplayName("Unconditional Error")
    void testUnconditionalError() {
        fail("This test is newer pass.");
    }

    @Test
    @DisplayName("TimeOut test")
    void testTimeOutAssertion() {
        assertTimeout(Duration.ofSeconds(2),() -> TimeUnit.SECONDS.sleep(5), "Time test fail. Too long executing.");
    }



//    @Test
//    void

}






