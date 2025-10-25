package lesson8_homework;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Голос собаки - Bark!");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Собака ест мясо. Она довольна.");
        } else if (food == "Grass") {
            System.out.println("Собака ест траву. Удовлетворительно.");
        } else {
            System.out.println("...");
        }
    }
}
