package lesson9_homework.task_two;

public class Triangle extends Figure{
    private double base;
    private double height;
    private double leftSide;
    private double rightSide;

    public Triangle(double base, double height, double leftSide, double rightSide) {
        this.base = base;
        this.height = height;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public void calculateSquare() {
        double base = this.base;
        double height = this.height;
        double square = (base * height) / 2;
        System.out.println("Площадь треугольника равна(см) = " + square);
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("Периметр треугольника равен(см) = " + forCalculatePerimeters());
    }

    @Override
    public double forCalculatePerimeters() {
        return base + leftSide + rightSide;
    }
}
