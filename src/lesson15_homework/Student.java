package lesson15_homework;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Double> marks;

    public Student(String name, String group, int course, List<Double> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>(marks);
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Double> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, курс %d, средний: %.2f)", name, group, course, getAverageMark());
    }

    public double getAverageMark() {
        if (marks.isEmpty()) return 0.0;
        double sum = 0.0;
        for (Double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public void incrementCourse() {
        course++;
    }
}
