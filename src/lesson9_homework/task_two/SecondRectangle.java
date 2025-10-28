package lesson9_homework.task_two;

public class SecondRectangle extends Figure{
    private double length;
    private double width;

    public SecondRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateSquare() {
        double length = this.length;
        double width = this.width;
        double square = length * width;
        System.out.println("Площадь прямоугольника(2) равна(см) = " + square);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Периметр прямоугольника(2) равeн(см) = " + forCalculatePerimeters());
    }

    @Override
    public double forCalculatePerimeters() {
        return (length + width) * 2;
    }
}
