package myexamples.static_constructor_example;

public class Animal {
    /*
    Так можно создать объект имея приватный конструктор -

    */
    private static Animal animal;
    private int countLegs;

    private Animal(int countLegs) {
        this.countLegs = countLegs;
    }

    public static Animal getAnimal() {
        animal = new Animal(3);
        System.out.println("Count of doors = " + animal.countLegs);
        return animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "countDoors=" + countLegs +
                '}';
    }
}
