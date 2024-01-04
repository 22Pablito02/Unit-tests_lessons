package HW_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListServiceTest {
    private ListService listService = new ListService();
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    void init() {
        list1 = List.of(1, 2, 3);
        list2 = List.of(2, 2);
    }

    /**
     * Проверка соответствия ожидаемому результату результата работы
     * метода getAvrgNumOfList()
     */
    @Test
    void getAvrgNumOfList() {
        assertEquals(2, listService.getAvrgNumOfList(list1));
        assertEquals(2, listService.getAvrgNumOfList(list2));
    }

    /**
     * Проверка корректной обработки ошибки ArithmeticException
     * */
    @Test
    @DisplayName("Test division by zero")
    void testDivideByZero() {
        List<Integer> list = new ArrayList<>();
        assertThrows(ArithmeticException.class, () -> listService.getAvrgNumOfList(list), "Division by zero should"
                + " throw ArithmeticException");
    }

    /**
     * Проверка на возврат значения не равного Null в результате работы метода comparisonTwoNumberLists()
     * Проверка на возврат одного и того же значения от разных входных параметров, но одинаковых
     * результатных знгачениях
     * */
    @Test
    @DisplayName("Test not Null in return ")
    void testComparisonTwoNumberLists() {
        String str = listService.comparisonTwoNumberLists(list1, list2);
        assertNotNull(str);
        assertEquals(listService.getAvrgNumOfList(list1), listService.getAvrgNumOfList(list2));
    }
}
