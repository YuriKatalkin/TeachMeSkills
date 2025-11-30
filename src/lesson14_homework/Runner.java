package lesson14_homework;

import java.io.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String inputFile = "TMS_Homework.txt";
        String outputFile = "Longest_Word.txt";
        String longestWord = "";

        File file = new File(inputFile);
        if (!file.exists()) {
            System.out.println("Файл не найден: " + inputFile);
            return;
        }
        System.out.println("Файл загружен: " + file.length() + " байт");

        try (Scanner scanner = new Scanner(new File(inputFile))) {
            int wordCount = 0;

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount++;

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Проанализировано слов: " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения файла!");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write(longestWord);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи!");
            return;
        }

        System.out.println("Задача выполнена!");
        System.out.println("Самое длинное слово: \"" + longestWord + "\"");
        System.out.println("Длина: " + longestWord.length() + " букв");
        System.out.println("Записано в файл: " + outputFile);
    }
}
