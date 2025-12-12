package lesson17_homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TaskTwo {
    public static void main(String[] args) {
        //Задача 2:
        //Используя Predicate среди массива чисел вывести только те, которые являются
        //положительными.

        List<Integer> nums = Arrays.asList(-1, 2, -3, -4, -5, 6, 7, -8);

        Predicate<Integer> isPositive = x -> x > 0;

        nums.stream().filter(isPositive).map(num -> "Положительное число: " + num).forEach(System.out::println);
    }
}
