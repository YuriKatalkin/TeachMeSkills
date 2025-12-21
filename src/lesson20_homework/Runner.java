package lesson20_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) {
        taskOne();
        //taskTwo();
    }

    public static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.print("Введите строки: ");
        List<String> strings = new ArrayList<>();

        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            strings.add(input);
        }

        String[] array = strings.toArray(new String[0]);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Строка " + i + ": " + array[i]);
            for (int j = 0; j < array[i].length(); j++) {
                System.out.println("  Символ на позиции " + j + ": " + array[i].charAt(j));
            }
        }

        Future<String> maxFuture = executor.submit(new MaxFinder(array));
        Future<String> minFuture = executor.submit(new MinFinder(array));

        try {
            System.out.println("Максимальная строка: '" + maxFuture.get() + "' (длина: " + maxFuture.get().length() + ")");
            System.out.println("Минимальная строка: '" + minFuture.get() + "' (длина: " + minFuture.get().length() + ")");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            scanner.close();
        }
    }

    static class MaxFinder implements Callable<String> {
        private final String[] array;

        public MaxFinder(String[] array) {
            this.array = array;
        }

        public String call() {
            if (array.length == 0) return "";
            String max = array[0];
            for (String s : array) {
                if (s.length() > max.length()) {
                    max = s;
                }
            }
            return max;
        }
    }

    static class MinFinder implements Callable<String> {
        private final String[] array;

        public MinFinder(String[] array) {
            this.array = array;
        }

        public String call() {
            if (array.length == 0) return "";
            String min = array[0];
            for (String s : array) {
                if (s.length() < min.length()) {  // ИСПРАВЛЕНО: < вместо >
                    min = s;
                }
            }
            return min;
        }
    }

    public static void taskTwo() {
        //Задача 2:
        //Сортировка массива цифр в нескольких потоках различными алгоритмами:
        // сортировка вставками;
        // сортировка выбором;
        // сортировка пузырьком.
        //Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
        //результат отсортированных массивов в консоль


    }
}
