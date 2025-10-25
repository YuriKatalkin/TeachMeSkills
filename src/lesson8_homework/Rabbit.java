package lesson8_homework;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Голос кролика - Pipip");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Кролик ест мясо. Она недоволен.");
        } else if (food == "Grass") {
            System.out.println("Кролик ест траву. Он доволен.");
        } else {
            System.out.println("...");
        }
    }
}
