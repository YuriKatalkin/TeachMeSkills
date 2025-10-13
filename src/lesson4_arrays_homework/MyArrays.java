package lesson4_arrays_homework;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        homework();
    }

    public static void homework() {
        int[] numbers = new int[]{1, 2, 3, 4, 2, 6};


        //Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }

        System.out.print("- Прямой порядок ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
        System.out.println(" - Обратный порядок ");

        //Задача 2:
        //Найти минимальный-максимальный элементы и вывести в консоль.

        int min = numbers[0];
        int max = numbers[5];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.print(min + " - Минимальный элемент ,  ");
        System.out.println(max + " - Максимальный элемент   ");

        //Задача 3:
        //Найти индексы минимального и максимального элементов и вывести в консоль.

        int minIndex = 0;
        int minValue = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Минимальный индекс - " + minIndex);
        int maxIndex = 5;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Максимальный индекс - " + maxIndex);

        //Задача 4:
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.

        int nullElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                nullElement++;
            }
        }
        System.out.println("Количество нулевых элементов в массиве - " + nullElement);

        //Задача 5:
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.

        System.out.print("Порядок элементов массива - ");
        for (int i = 5; i >= numbers.length / 2; i--) {
            int dividedElements = numbers[i];
            if (numbers[i] == dividedElements) {

            }
            System.out.print(dividedElements);
        }

        for (int i = numbers.length - 4; i >= 0; i--) {
            int lastPartElements = numbers[i];
            if (numbers[i] == lastPartElements) {

            }
            System.out.print(lastPartElements);
        }
        System.out.println();

        //Задача 6:
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).

        System.out.println("Проверка массива:");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                System.out.println("Проверка: - массив не является возрастающей последовательностью!!!");
                break;
            } else {
                System.out.println("Проверка: " + "индекс массива(numbers[" + i + "])" + " - текущая возрастающая последовательность...");
            }
        }
        System.out.println("!!!Проверка завершена!!!");

        //Задача *:
        //Имеется массив из неотрицательных чисел(любой). Представьте что массив
        //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        //содержит нуля в начале, кроме самого числа 0.
        //Пример:
        //Input: [1,4,0,5,6,3]
        //Output: [1,4,0,5,6,4]
        //Input: [9,9,9]
        //Output: [1,0,0,0]


    }
}
