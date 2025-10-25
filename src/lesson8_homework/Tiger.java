package lesson8_homework;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Голос тигра - Rrrrawrrr...");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Тигр ест мясо. Он доволен.");
        } else if (food == "Grass") {
            System.out.println("Тигр ест траву. Удовлетворительно.");
        } else {
            System.out.println("...");
        }
    }
}
