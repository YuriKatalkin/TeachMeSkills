package lesson15_homework;

import myexamples.ExampleForTeacher.Animal;

public class TaskTwo {
    public static void main(String[] args) {
        //Задача 2:
        //Создать класс, который будет хранить в себе коллекцию с названиями животных.
        //Реализовать методы удаления и добавления животных по следующим правилам:
        //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        //объекта этого класса в main методе другого класса.

        AnimalCollection collection = new AnimalCollection();

        collection.addAnimal("Лев");

        collection.addAnimal("Кот");

        collection.addAnimal("Овца");

        collection.printAnimals();

        System.out.println("Последнее животное из списка удалено - " + collection.removeAnimals());

        collection.printAnimals();

        System.out.println("Размер коллекции - " + collection.size());
    }
}
