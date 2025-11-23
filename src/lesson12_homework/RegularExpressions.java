package lesson12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    private String[] array;

    public void regularExpressionExample() {
        Scanner input = new Scanner(System.in);

        int wordNum = 1;
        this.array = new String[wordNum];

        System.out.println("Введите длинну слова, от 2 до 6 символов: ");

        int wordLength = input.nextInt();
        input.nextLine();


        for (int i = 0; i < wordNum; i++) {
            if (wordLength >= 2 && wordLength <= 6) {
                System.out.println("Введите слово из - " + wordLength + " символов: ");
                String word = input.nextLine();

                String regex = "\\b[A-ZА-Я]{2,6}\\b";
                Pattern pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
                Matcher matcher = pattern.matcher(word);

                if (matcher.find()) {
                    System.out.println("Найдено: " + matcher.group());
                } else {
                    System.out.println("Не найдено.");
                }
            } else {
                System.out.println("Ввод невозможен.");
            }
        }
    }
}
