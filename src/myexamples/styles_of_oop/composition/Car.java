package myexamples.styles_of_oop.composition;

public class Car {
    private FirstWheel firstWheel = new FirstWheel(); // колесо является частью машины
    private SecondWheel secondWheel = new SecondWheel();

    public void drive() {
        firstWheel.rotate();
        secondWheel.rotate();
        System.out.println("Car is driving");
    }
}
