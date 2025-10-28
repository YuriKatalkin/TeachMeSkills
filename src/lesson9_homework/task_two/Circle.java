package lesson9_homework.task_two;

public class Circle extends Figure {
    private double radius;
    private final double countP = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateSquare() {
        double countP = this.countP;
        double square = countP * Math.pow(this.radius, 2);
        System.out.println("Площадь круга равна(см) = " + square);
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("Периметр круга равен(см) = " + forCalculatePerimeters());
    }

    @Override
    public double forCalculatePerimeters() {
        return 2 * countP * radius;
    }
}
