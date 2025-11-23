package lesson10_homework;

public class Runner1 {
    public static void main(String[] args) {
        //Задача 1:
        //Создать класс для описания пользователя системы. Переопределить в классе методы
        //toString, hashcode и equals. Создать несколько экземпляров класса с одним и тем же
        //значением полей и сравнить с помощью метода equals.

        User user1 = new User("Archil", "random@archil", 30 );
        User user2 = new User("Archil", "random@archil", 30);
        User user3 = new User("Yura", "random@yura", 30);
        User user4 = new User("Yura", "random@yura", 30);
        System.out.println("Сравнение №1 = " + user1.equals(user2));
        System.out.println("Сравнение №2 = " + user3.equals(user4));
        System.out.println("Сравнение №3 = " + user2.equals(user4));


    }
}
