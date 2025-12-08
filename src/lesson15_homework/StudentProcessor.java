package lesson15_homework;

import java.util.Iterator;
import java.util.List;

public class StudentProcessor {

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageMark() < 3.0) {
                iterator.remove();
            } else {
                student.incrementCourse();
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на " + course + " курсе:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
