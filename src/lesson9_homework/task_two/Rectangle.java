package lesson9_homework.task_two;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateSquare() {
        double length = this.length;
        double width = this.width;
        double square = length * width;
        System.out.println("Площадь прямоугольника равна(см) = " + square);
    }

    @Override
    public void calculatePerimeters() {
        System.out.println("Периметр прямоугольника равeн(см) = " + forCalculatePerimeters());
    }

    @Override
    public double forCalculatePerimeters() {
        return (length + width) * 2;
    }
}
