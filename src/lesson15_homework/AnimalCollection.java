package lesson15_homework;

import java.util.Deque;
import java.util.LinkedList;

public class AnimalCollection {
    private Deque<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
         animals.addFirst(animal);
    }

    public int size() {
        return animals.size();
    }

    public String removeAnimals() {
       return animals.pollLast();
    }

    public void printAnimals() {
        System.out.println("Вывод: " + animals);
    }

}
