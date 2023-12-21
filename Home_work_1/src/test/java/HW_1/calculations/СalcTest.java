

package HW_1.calculations;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class СalcTest {
        private Calc calculator;

        @BeforeAll
        static void setup() {
            System.out.println("Before all tests");
        }

        @BeforeEach
        void init() {
            calculator = new Calc();
        }
        @AfterEach
        void cleanup() {
            calculator = null;
        }

        @AfterAll
        static void teardown() {
            System.out.println("After all tests");
        }


        @Test
        // @DisplayName позволяет создать пользовательское название теста в консоле слева
        @DisplayName("Test addition")

            // Метод проверяет на соответствие предполагаемый результат и результат работы метода сложения
        void testAdd() {
            int result = calculator.add(5, 3);
            assertEquals(8, result, "5 + 3 should equal 8");
        }

        @Test
        @DisplayName("Test subtraction")

            // Метод проверяет на соответствие предполагаемый результат и результат работы метода вычитания

        void testSubtract() {
            int result = calculator.subtract(10, 4);
            assertEquals(6, result, "10 - 4 should equal 6");
        }

        @Test
        @DisplayName("Test multiplication")

            // Метод проверяет на соответствие предполагаемый результат и результат работы метода умножения

        void testMultiply() {
            int result = calculator.multiply(6, 7);
            assertEquals(42, result, "6 * 7 should equal 42");
        }

        @Test
        @DisplayName("Test division")

            // Метод проверяет на соответствие предполагаемый результат и результат работы метода деления

        void testDivide() {
            int result = calculator.divide(20, 5);
            assertEquals(4, result, "20 / 5 should equal 4");
        }

        @Test
        @DisplayName("Test division by zero")

            // Метод проверяет корректную обработку исключения при попытки деления на 0

        void testDivideByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                    "Division by zero should throw ArithmeticException");
        }

        @Test
        @DisplayName("Test calculateDiscount with valid input")
            // Метод проверяет на соответствие предполагаемый результат и результат работы метода вычисления скидки

        void calculateDiscount() {
            double result = calculator.calculateDiscount(20, 10);
            assertEquals(18, result, "Your sum with discount should equal 18");
        }

        @Test
        @DisplayName("Test calculateDiscount with negative sum")

            // Метод проверяет корректную обработку исключения при попытки вычислить скидку из отрицательной суммы

        void testCalculateDiscountByPositiveSum() {
            assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(-5, 5),
                    "Sum can`t be less than 0");
        }

        @Test
        @DisplayName("Test calculateDiscount with big discount")

            // Метод проверяет корректную обработку исключения при попытки вычислить скидку более 50%

        void testCalculateDiscountByBigDiscount() {
            assertThrows(ArithmeticException.class, () -> calculator.calculateDiscount(50, 60),
                    "Sum can`t be less than 0");
        }
    }
