package lesson17_homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TaskFour {
    public static void main(String[] args) {
        //Задача 4:
        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары.

        List<String> sums = Arrays.asList("100 руб", "90 руб", "350 руб");

        Consumer<String> toDollars = s -> {

            double byn = Double.parseDouble(s.split(" ")[0]);

            System.out.printf("%s → %.2f USD%n", s, byn * 0.34);

        };

        sums.forEach(toDollars);
    }
}
