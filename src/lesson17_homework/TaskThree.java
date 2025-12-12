package lesson17_homework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TaskThree {
    public static void main(String[] args) {
        //Задача 3:
        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.
        List<String> sums = Arrays.asList("100 руб", "90 руб", "350 руб");

        Function<String, Double> toDollars = str -> {

            String[] parts = str.split(" ");

            double byn = Double.parseDouble(parts[0]);

            return byn * 0.34;
        };

        sums.forEach(str -> System.out.printf("%s - %.2f USD%n", str, toDollars.apply(str)));
    }
}
