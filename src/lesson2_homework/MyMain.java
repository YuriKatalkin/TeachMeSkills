package lesson2_homework;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Hello World!\nЯ родился!☺");
        System.out.print("Меня зовут Юра!\t");
        int age = 24;
        System.out.println("Мне\t" + age + "\tгода");
        //taskOne();
        //taskTwo();
        //taskThree();
        //taskFour();
        //taskFive();
        //taskWithStar();
        //castingTraining();
        //

    }

    //training for casting
    public static void castingTraining() {
        float myFloatValue = 0.33F;
        double myDoubleValue = myFloatValue;
        System.out.println("Автоматическое преобразование - вверх - " + myDoubleValue);
        int smallIntegerValue = 1135;
        byte myByteValue = (byte) smallIntegerValue;
        System.out.println("Принудительное преобразование - вниз - " + myByteValue);


    }

    //Задача 1:
    //Написать приложение, которое будет вычислять и выводить значение по формуле:
    //a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.

    public static void taskOne() {
        int b = 4;
        int c = 5;
        System.out.println("Решение задачи №1 - " + 4*(b+c-1)/2);
    }

    //Задача 2:
    //В переменной n хранится двузначное число. Создайте программу, вычисляющую и
    //выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
    //(2+6).

    public static void taskTwo() {
        int n = 26;
        int a = n / 10;
        int b = n % 10;
        int sum = a + b;
        System.out.println("Решение задачи №2 - " + sum);
    }

    //Задача 3:
    //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
    //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
    //9 (1+2+6).

    public static void taskThree() {
        int n = 126;
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        int sum = a + b + c;
        System.out.println("Решение задачи №3 - " + sum);
    }

    //Задача 4:
    //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //программу, округляющую число n до ближайшего целого и выводящую результат на
    //экран.

    public static void taskFour() {
        double n = 36.6;
        double round = Math.round(n);
        System.out.println("Решение задачи №4 - " + round);
    }

    //Задача 5:
    //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    //на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    //когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.

    public static void taskFive() {
        int a = 21;
        int b = 8;
        int divide = a / b;
        int remainder = a % b;
        System.out.println("Решение задачи №5 - " + "Результат деления - " + divide + " Остаток - " + remainder);
    }

    //Задача *:
    //Написать программу которая будет менять местами значение целочисленных
    //переменных. Пример:
    //int a = 1; int b = 2;

    /// /код (ваше решение)
    //sout(a); //выведет 2
    //sout(b); //выведет 1
    //Усовершенствовать программу, использовать только 2 входные переменные (a,b).

    public static void taskWithStar() {
        int a = 1;
        int b = 2;
        if (a == a) {
            System.out.println("На месте переменной а - b = " + b);
        } if (b == b) {
            System.out.println("На месте переменной b - a = " + a);
        }
    }
}
