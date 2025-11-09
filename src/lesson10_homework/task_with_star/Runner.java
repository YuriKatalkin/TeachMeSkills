package lesson10_homework.task_with_star;

import lesson10_homework.task_one.User;

public class Runner {
    public static void main(String[] args) {
        //Задача *:
        //Создать программу для реализации поверхностного и глубокого клонирования объекта
        //класса User. Пусть на вход программе будет передаваться тип операции клонирования
        //(поверхностное клонирование или глубокое), а также id юзера для клонирования.
        User user = new User("User", "user@gmail.com", 20);
        System.out.println(user.getClass());

    }
}
