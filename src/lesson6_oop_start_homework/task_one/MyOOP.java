package lesson6_oop_start_homework.task_one;

public class MyOOP {
    public static void main(String[] args) {
        //Задача 1:
        //Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        //метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        //который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        //выводит текущую информацию о карточке. Напишите программу, которая создает три
        //объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        //третьей. Выведите на экран текущее состояние всех трех карточек.

        CreditCard cardOne = new CreditCard(4123_4234_5678_1111L, 1100);
        CreditCard cardTwo = new CreditCard(4123_4234_5678_2222L, 1200);
        CreditCard cardThree = new CreditCard(4123_4234_5678_3333L, 1300);
        cardOne.getInfo();
        //cardTwo.getInfo();
        //cardThree.getInfo();
        cardOne.setMoney();
        //cardTwo.setMoney();
        //cardThree.getMoney();
        cardOne.getNewInfo();
        //cardTwo.getNewInfo();
        //cardThree.getNewInfo();

    }
}
