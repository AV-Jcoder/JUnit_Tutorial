package org.afoninav;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFunctionsTest {

    static MyFunctions f;

    @BeforeAll
    static void setUp() {
        f = new MyFunctions();
    }

    @Test
    @DisplayName("Factorial.")
    void computeFactorialTest() {
        assertEquals(6, f.factorial(3), "Incorrect computing factorial function.");
    }

    @Test
    @DisplayName("Fibonacci numbers.")
    void computeFibonacciNumbs() {
        assertEquals(3,f.fibonacci(5), "Incorrect computing Fibonacci numbers.");
    }

    @Test
    @DisplayName("Triangle numbers.")
    void computeTriangleNumbers() {
        assertEquals(15,f.triangleNumbers(5),"Incorrect computing triangle numbers.");
    }
}
