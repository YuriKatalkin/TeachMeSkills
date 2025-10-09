package lesson3_operators_homework;

import java.util.Scanner;

public class MyOperators {
    public static void main(String[] args) {
//        taskOne();
//        taskTwo();
//        taskThree();

    }

    //Practise Tasks:

    public static void taskOne() {
        Scanner input = new Scanner(System.in);
        String numberOfMonth = input.nextLine();

        switch (numberOfMonth) {
            case "9", "10", "11" -> System.out.println("AUTUMN");
            case "12", "1", "2" -> System.out.println("WINTER");
            case "3", "4", "5" -> System.out.println("SPRING");
            case "6", "7", "8" -> System.out.println("SUMMER");
            default -> System.out.println("null");
        }
    }

    public static void taskTwo() {
        int a = 0;
        while (a <= 25) {
            System.out.print("..." + a + "; ");
            a++;
        }
    }

    public static void taskThree() {
        int a = 0;
        for (a = 12; a <= 20; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }

    //Homework:


}



