package lesson9_homework.task_one;

public class Runner {
    public static void main(String[] args) {
        //Задача 1:
        //Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        //который печатает название должности и имплементировать этот метод в созданные
        //классы.
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        accountant.printJobTitle();
        director.printJobTitle();
        worker.printJobTitle();


    }
}
