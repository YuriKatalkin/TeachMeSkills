package lesson2;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Hello World!\nЯ родился!☺");
        System.out.print("Меня зовут Юра!\t");
        int age = 24;
        System.out.println("Мне\t" + age + "\tгода");
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskWithOneStar();
        castingTraining();
        System.out.println("Test commit for git-repository");
    }

    public static void castingTraining() {
        float myFloatValue = 0.33F;
        double myDoubleValue = myFloatValue;
        System.out.println("Автоматическое преобразование - вверх - " + myDoubleValue);
        int smallIntegerValue = 1135;
        byte myByteValue = (byte) smallIntegerValue;
        System.out.println("Принудительное преобразование - вниз - " + myByteValue);


    }

    public static void taskOne() {
        int b = 4;
        int c = 5;
        System.out.println("Решение задачи №1 - " + 4*(b+c-1)/2);
    }

    public static void taskTwo() {
        int n = 26;
        int a = n / 10;
        int b = n % 10;
        int sum = a + b;
        System.out.println("Решение задачи №2 - " + sum);
    }

    public static void taskThree() {
        int n = 126;
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        int sum = a + b + c;
        System.out.println("Решение задачи №3 - " + sum);
    }

    public static void taskFour() {
        double n = 36.6;
        double round = Math.round(n);
        System.out.println("Решение задачи №4 - " + round);
    }

    public static void taskFive() {
        int a = 21;
        int b = 8;
        int divide = a / b;
        int remainder = a % b;
        System.out.println("Решение задачи №5 - " + "Результат деления - " + divide + " Остаток - " + remainder);
    }

    public static void taskWithOneStar() {
        int a = 1;
        int b = 2;
        if (a == a) {
            System.out.println("На месте переменной а - b = " + b);
        } if (b == b) {
            System.out.println("На месте переменной b - a = " + a);
        }
    }
}
