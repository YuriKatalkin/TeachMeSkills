package lesson16_homework;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {
    public static void main(String[] args) {
        //Задача 1:
        //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //2 или более раз. Пример:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}

        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println(wordMultiply(test1));

        String[] test2 = {"c", "b", "a"};
        System.out.println(wordMultiply(test2));

        String[] test3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiply(test3));
    }
    public static Map<String, Boolean> wordMultiply(String[] words) {
        Map<String, Integer> counter = new HashMap<>();

        for (String word : words) {
            counter.put(word, counter.getOrDefault(word, 0) + 1);
        }

        Map<String, Boolean> result = new HashMap<>();
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            result.put(entry.getKey(), entry.getValue() >= 2);
        }
        return  result;
    }


}
