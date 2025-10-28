package lesson9_homework.task_two;

public class SecondTriangle extends Figure{
    private double base;
    private double height;
    private double leftSide;
    private double rightSide;

    public SecondTriangle (double base, double height, double leftSide, double rightSide) {
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
        System.out.println("Площадь треугольника(2) равна(см) = " + square);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр треугольника(2) равен(см) = " + forCalculatePerimeters());
    }

    @Override
    public double forCalculatePerimeters() {
        return base + leftSide + rightSide;
    }
}
