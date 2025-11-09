package lesson10_homework.task_one;

public class Runner {
    public static void main(String[] args) {
        //Задача 1:
        //Создать класс для описания пользователя системы. Переопределить в классе методы
        //toString, hashcode и equals. Создать несколько экземпляров класса с одним и тем же
        //значением полей и сравнить с помощью метода equals.
        User user1 = new User("Archil", "random@archil", 30 );
        User user2 = new User("Archil", "random@archil", 30);
        System.out.println(user1.equals(user2));
        System.out.println(user1 == user2);
    }
}
