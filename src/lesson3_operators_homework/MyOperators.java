package lesson3_operators_homework;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        homeworkTaskOne();
    }

    public static void homeworkTaskOne() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a % 2;
        if (0 == a % 2) {
            System.out.println("Чётное число:" + b);
        } else {
            System.out.println("Не чётное число:" + b);
        }
        homeworkTaskOne();
    }

    public static void homeworkTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int t = input.nextInt();
        if (t > -5) {
            System.out.println();
        } else if (-5 >= t && t >= -20) {
            System.out.println();
        } else if (-20 > t) {
            System.out.println();
        }
        homeworkTaskTwo();
    }

    public static void homeworkTaskThree() {
        for (double i = 10; i < 20 ; i++) {
            System.out.println(Math.pow(i, 2));
        }
        homeworkTaskThree();
    }

    public static void homeworkTaskFour() {
        int a = 7;
        while (a <= 98) {
            a = a + 7;
            System.out.print(a + "...");
        }
        homeworkTaskFour();
    }
    //Задача *:
    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные.
    public static void taskWithStar() {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();


        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
        taskWithStar();
        //
    }
}













