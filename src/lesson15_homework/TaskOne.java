package lesson15_homework;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskOne {
    public static void main(String[] args) {
        //Задача 1:
        //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        //При решении использовать коллекции.
        taskOne();
    }

    public static void taskOne() {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите числа: ");

        String s = input.nextLine();

        String[] parts = s.split(",");

        Set<String> nums = new LinkedHashSet<>();

        for (String part : parts) {
            nums.add(part.trim());
        }

        System.out.println("Результат: " + nums);

    }

}
