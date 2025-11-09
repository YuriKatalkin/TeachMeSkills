package myexamples.styles_of_oop.delegation_mixedwith_composition;

public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void startCar() {
        engine.start();
        System.out.println("Car is running");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Car is stopped");
    }
}
