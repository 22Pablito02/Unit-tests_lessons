package HW_1.calculations;

public class Calc {
        /**
         * Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и
         * процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием
         * библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать
         * исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
         *
         */
        public double calculateDiscount(int sum, int discount) {
            if (sum < 0) {
                throw new ArithmeticException("Sum can`t be less than 0");
            }
            // Допустим, нельзя получить скидку больше 50%
            if (discount > 50) {
                throw new ArithmeticException("Too mach discount! It can`t be more than 50%");
            }
            int i = 100 - discount;

            return i * 0.01 * sum;
        }
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        }
    }
