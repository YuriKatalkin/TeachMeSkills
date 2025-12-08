package lesson16_homework;

import java.util.HashMap;
import java.util.Map;

public class TaskTwo {
    public static void main(String[] args) {
        //Задача 2:
        //На вход поступает массив непустых строк, создайте и верните Map<String,
        //String> следующим образом: для каждой строки добавьте ее первый символ в
        //качестве ключа с последним символом в качестве значения. Пример:
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

        System.out.println(pairs(new String[]{"code", "bug"}));

        System.out.println(pairs(new String[]{"man", "moon", "main"}));

        System.out.println(pairs(new String[]{"man", "moon", "good", "night"}));
    }
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> counter = new HashMap<>();

        for (String str : strings) {
            String firstChar = String.valueOf(str.charAt(0));

            String lastChar = String.valueOf(str.charAt(str.length() - 1));
            counter.put(firstChar, lastChar);
        }
        return counter;
    }
}
