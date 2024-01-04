package HW_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        UI ui = new UI();
        ListService listService = new ListService();

        System.out.println("Здравствуйте! Программа запрашивает длину 1 списка. Затем предлагает ввести целые\n"
                + " натуральные числа. Затем длину 2 списка и его элементы - целые натуральные числа.\n На выходе "
                + "представляется среднее арифмитическое каждого списка и результат\n их сравнения");
        // Формируем 2 спсика по параметрам от пользователя
        List<Integer> list1 = ui.createListByUserParametrs();
        List<Integer> list2 = ui.createListByUserParametrs();

        //Выводим сообщения со значениями ср.ариф.по спискам
        System.out.println("Cреднее значение list1 = " + listService.getAvrgNumOfList(list1));
        System.out.println("Cреднее значение list2 = " + listService.getAvrgNumOfList(list2));

        //Выводим результат сравнения
        String str = listService.comparisonTwoNumberLists(list1, list2);
        System.out.println(str);
    }
}