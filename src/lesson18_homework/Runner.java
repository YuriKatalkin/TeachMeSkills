package lesson18_homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //Задача 1:
        //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        //Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println("Исходный список: " + numbers);

        int sum = numbers.stream().distinct().filter( x -> x % 2 == 0).reduce(0, Integer::sum);

        System.out.println("Сумма четных уникальных чисел: " + sum);
    }
}
