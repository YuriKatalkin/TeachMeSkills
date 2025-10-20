package lesson3_operators_homework;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
        //homeworkTaskOne();
        //homeworkTaskTwo();
        //homeworkTaskThree();
        //homeworkTaskFour();

        //!!! Не завершенное !!!
        //taskWithStar();
    }

//    Задача 1:
//    Напишите программу, которая будет принимать на вход число из консоли и на выход
//    будет выводить сообщение четное число или нет. Для определения четности числа
//    используйте операцию получения остатка от деления (операция выглядит так: '% 2').

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

    //Задача 2:
    //Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».

    public static void homeworkTaskTwo() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (-5 >= t && t >= -20) {
            System.out.println("Normal");
        } else if (-20 > t) {
            System.out.println("Cold");
        }
        homeworkTaskTwo();
    }

    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

    public static void homeworkTaskThree() {
        for (int i = 10; i <= 20 ; i++) {
            double square = Math.pow(i, 2);
            System.out.println("Квадрат числа - " + i + " равен - " + square);
            if (i == 20) {
                break;
            }
        }
    }

    //Задача 4:
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

    public static void homeworkTaskFour() {
        int a = 7;
        while (a <= 98) {
            a = a + 7;
            System.out.print(a + "...");
        }
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
    }
}













