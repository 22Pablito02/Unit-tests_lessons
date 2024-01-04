package HW_6;

import java.util.List;

public class ListService {

    /**
     * @List<Integer> list - список натуральных целых чисел.
     * Если список пустой - пробрасывается исключение.
     * Иначе return result / list.size()  (ср.ариф. чисел в списке)
     * */
    public double getAvrgNumOfList(List<Integer> list) {
        double result = 0;
        for (Integer el : list) {
            result += el;
        }
        if (list.isEmpty()) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return result / list.size();
    }
    /**
     * @List<Integer> list1 и list2 - список натуральных целых чисел.
     * return String содержание строки определяется в зависимости от результата сравнения
     * */

    public String comparisonTwoNumberLists(List<Integer> list1, List<Integer> list2) {
        double avrg1 = 0;
        double avrg2 = 0;

        try {
            avrg1 = getAvrgNumOfList(list1);
            avrg2 = getAvrgNumOfList(list2);
        } catch (ArithmeticException e) {
            System.out.println("Не удалось выполнить задачу");
        }
        if (avrg1 > avrg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avrg1 < avrg2) {
            return "Второй список имеет большее среднее значение";
        } else if (avrg1 == avrg2) {
            return "Средние значения равны";
        } else {
            return "Не удалось выполнить задачу";
        }
    }

}
