import org.afoninav.Calculator;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestCreator {

    @TestFactory
    Stream<DynamicTest> testDifferentMultiplyOperations() {
        Calculator calc = new Calculator();
        int[][] data = new int[][] { { 1, 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];

            System.out.print(m1 + "---" + m2 + "---" + expected + "-----\n");

            return dynamicTest(m1 + " * " + m2 + " = " + expected, () -> assertEquals(expected, calc.multiply(m1, m2)));
        });
    }

    




}
