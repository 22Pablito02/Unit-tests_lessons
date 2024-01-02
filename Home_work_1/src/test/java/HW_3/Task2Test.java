package HW_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
        // Метод проверяет работу numberInInterval с аргументом 30, который подходит в интервал (25;100)
        // и 5, который  не входит
    void numberInInterval() {
        Task2 task2 = new Task2();
        assertTrue(task2.numberInInterval(30));
        assertFalse(task2.numberInInterval(5));
    }
}
