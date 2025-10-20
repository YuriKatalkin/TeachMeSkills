package lesson5_multi_arrays_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyMultiArrays {
    public static void main(String[] args) {
        //homeworkTaskOne();
        //homeworkTaskTwo();
    }

    //Задача 1:

    public static void homeworkTaskOne () {

        Scanner input =  new Scanner(System.in);
        int rows = 2;
        int cols = 2;
        int result = 0;
        int[][] numbers = new int[rows][cols];
        Random random = new Random();

        //1.1. - Создать двумерный массив, заполнить его случайными числами.

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = random.nextInt(10);
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-".repeat(50));


        //1.2. - Добавить к каждому значению число, которое пользователь будет вводить с консоли.

        System.out.println("Введите число через клавишу enter: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int numberToAdd = input.nextInt();
                numbers[i][j] += numberToAdd;
                System.out.println("-");
            }
        }

        System.out.println("-".repeat(50));
        System.out.println("Измененный массив - ");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));
        System.out.println("Сумма получившихся элементов  - ");

        // 1.3. - Найти сумму всех получившихся элементов и вывести в консоль.

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result += numbers[i][j];
            }
        }
        System.out.println(result);
    }

    //Задача 2:

    public static void homeworkTaskTwo() {

        //Создать программу для раскраски шахматной доски с помощью цикла. Создать
        //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        //B(Black) или W(White). При выводе результат работы программы должен быть
        //следующим:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W

        String[][] strings = new String[8][8];

        System.out.println("Результат: ");

        for (int row = 0; row < strings.length; row++) {
            for (int col = 0; col < strings[row].length; col++) {
                if ((row + col) % 2 == 0) {
                    strings[row][col] = "W";
                } else {
                    strings[row][col] = "B";
                }
            }
            System.out.println();
        }

        for (int row = 0; row < strings.length; row++) {
            for (int col = 0; col < strings[row].length; col++) {
                System.out.print(strings[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
