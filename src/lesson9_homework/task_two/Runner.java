package lesson9_homework.task_two;

public class Runner {
    public static void main(String[] args) {
        //Задача 2:
        //Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        //функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        //абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        //периметра всех фигур в массиве.
        Circle circle = new Circle(30);
        circle.calculateSquare();
        circle.calculatePerimeter();
        circle.forCalculatePerimeters();

        System.out.println("_".repeat(50));

        Rectangle rectangle = new Rectangle(15, 30);
        rectangle.calculateSquare();
        rectangle.calculatePerimeter();
        rectangle.forCalculatePerimeters();

        System.out.println("_".repeat(50));

        Triangle triangle = new Triangle(15, 30, 31, 31);
        triangle.calculateSquare();
        triangle.calculatePerimeter();
        triangle.forCalculatePerimeters();

        System.out.println("_".repeat(50));

        SecondTriangle secondTriangle = new SecondTriangle(10,24,25,25);
        secondTriangle.calculateSquare();
        secondTriangle.calculatePerimeter();
        secondTriangle.forCalculatePerimeters();

        System.out.println("_".repeat(50));

        SecondRectangle secondRectangle = new SecondRectangle(12,28);
        secondRectangle.calculateSquare();
        secondRectangle.calculatePerimeter();
        secondRectangle.forCalculatePerimeters();

        System.out.println("_".repeat(50));

        Figure[] figures = {circle, rectangle, triangle, secondTriangle, secondRectangle};
        double sumAllPerimeters = 0;
        for (Figure fig : figures) {
            sumAllPerimeters += fig.forCalculatePerimeters();
        }
        System.out.println("Сумма периметров равна(см) = " + sumAllPerimeters);
    }
}
