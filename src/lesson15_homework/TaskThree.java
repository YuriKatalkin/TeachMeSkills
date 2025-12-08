package lesson15_homework;

import java.util.ArrayList;
import java.util.List;

import static lesson15_homework.StudentProcessor.printStudents;
import static lesson15_homework.StudentProcessor.processStudents;

public class TaskThree {
    public static void main(String[] args) {
        //Задача 3:
        //Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
        //оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
        //Написать метод, который удаляет студентов со средним баллом <3. Если средний
        //балл>=3, студент переводится на следующий курс. Дополнительно написать метод
        //printStudents(List<Student> students, int course), который получает список студентов и
        //номер курса. А также печатает на консоль имена тех студентов из списка, которые
        //обучаются на данном курсе.

        List<Student> students = new ArrayList<>();

        students.add(new Student("Юрий", "821", 1, List.of(2.5, 2.0, 3.0)));

        students.add(new Student("Арчил", "563", 1, List.of(4.0, 3.5, 4.5)));

        students.add(new Student("Николай", "241", 1, List.of(3.0, 3.0, 3.0)));

        processStudents(students);

        printStudents(students, 2);
    }
}


