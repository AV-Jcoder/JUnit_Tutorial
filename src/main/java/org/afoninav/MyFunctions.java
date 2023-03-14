package org.afoninav;

public class MyFunctions {

    /**
     * Вычисление факториала числа.
     * @param n - число.
     * @return - факториал числа
     */
    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    /**
     * Вычисление чисел из ряда фибоначчи.
     * @param n - номер числа в ряду фибо.
     * @return число фибоначчи под указанным номером.
     */
    public int fibonacci(int n) {
        int presiding = 0;
        int current = 1;
        if (n == 1) {
            return presiding;
        }
        if (n == 2) {
            return current;
        }
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = current + presiding;
            presiding = current;
            current = result;
        }
        return result;
    }

    /**
     * Треугольные числа.
     * @param n - номер числа в ряду.
     * @return треугольное число.
     */
    public int triangleNumbers(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + triangleNumbers(n-1);
    }


}
