package lesson17_homework;

import java.util.Scanner;
import java.util.function.Supplier;

public class TaskFive {
    public static void main(String[] args) {
        //Задача 5:
        //Используя Supplier написать метод, который будет возвращать введенную с консоли
        //строку задом наперед.

        Supplier<String> reverseString = () -> {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите строку: ");

            String input = scanner.nextLine();

            return new StringBuilder(input).reverse().toString();
        };

        String reversed = reverseString.get();

        System.out.println("Задом наперед: " + reversed);
    }
}
