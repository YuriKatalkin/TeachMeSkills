package myexamples;

import java.util.Arrays;

public class MyExample {
    public static void main(String[] args) {
forI();

    }
    public static void forI() {
        int i = 0;
        for (int j = 0; j < 10; j++) {
            i += ++j;
        }
        System.out.println("Результат = " + i);
    }
}