package lesson10_homework;

public class Runner2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Задача *:
        //Создать программу для реализации поверхностного и глубокого клонирования объекта
        //класса User. Пусть на вход программе будет передаваться тип операции клонирования
        //(поверхностное клонирование или глубокое), а также id юзера для клонирования.

        AliveHuman aliveHuman = new AliveHuman("Yura");
        User user1 = new User("id123456", aliveHuman);

        //shallow
//        User user2 = user1.shallowClone();
//        user2.aliveHuman.name = "Antony";
//        System.out.println("shallow cloned - ");
//        System.out.println(user1);
//        System.out.println(user2);

        //deep
        User user2 = user1.deepClone();
        user2.aliveHuman.name = "Antony";
        System.out.println("deep cloned - ");
        System.out.println(user1);
        System.out.println(user2);




    }
}
