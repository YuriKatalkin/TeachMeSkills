package lesson11_homework;

import java.util.Scanner;

public class MyStrings {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
    }

    public static void taskOne() {
        //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        //найденные строки и их длину.

        Scanner input = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        String shortest = str1;
        String longest = str1;

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }

        if (str2.length() > longest.length()) {
            longest = str2;
        }

        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        if (str3.length() > longest.length()) {
            longest = str3;
        }
        System.out.println("Самая длинная строка: " + longest + ", её длинна: " + longest.length());
        System.out.println("Самая короткая строка: " + shortest + ", её длинна: " + shortest.length());

        System.out.println("_".repeat(50));
    }

    public static void taskTwo() {
        //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        //значений их длины.

        Scanner input = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        if (str1.length() > str2.length()) {
            String temp = str1; str1 = str2; str2 = temp;
        }

        if (str2.length() > str3.length()) {
            String temp = str2; str2 = str3; str3 = temp;
        }

        if (str1.length() > str2.length()) {
            String temp = str1; str1 = str2; str2 = temp;
        }

        System.out.println("Отсортированные строки по длине:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("_".repeat(50));
    }

    public static void taskThree() {
        //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину.

        Scanner input = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        double average = (len1 + len2 + len3) / 3.0;

        System.out.println("Средняя длина строк: " + average);

        if (len1 < average) {
            System.out.println("\"" + str1 + "\" - длина: " + len1);
        }
        if (len2 < average) {
            System.out.println("\"" + str2 + "\" - длина: " + len2);
        }
        if (len3 < average) {
            System.out.println("\"" + str3 + "\" - длина: " + len3);
        }

        System.out.println("_".repeat(50));
    }

    public static void taskFour() {
        //4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        //Если таких слов несколько, найти первое из них.

        Scanner input = new Scanner(System.in);

        System.out.println("Введите 3 строки: ");

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();

        if (hasAllUniqueChars(str1)) {
            System.out.println("Первое слово с уникальными символами: " + str1);
        } else if (hasAllUniqueChars(str2)) {
            System.out.println("Первое слово с уникальными символами: " + str2);
        } else if (hasAllUniqueChars(str3)) {
            System.out.println("Первое слово с уникальными символами: " + str3);
        } else {
            System.out.println("Слов с уникальными символами нет");
        }

        System.out.println("_".repeat(50));
    }

    private static boolean hasAllUniqueChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void taskFive() {
        //5. Вывести на консоль новую строку, которой задублирована каждая буква из
        //начальной строки. Например, "Hello" -> "HHeelllloo".

        System.out.println("Введите строку: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Результат: " + duplicateChars(input));

        System.out.println("_".repeat(50));
    }

    private static String duplicateChars(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result += c;
            result += c;
        }
        return result;
    }
}
