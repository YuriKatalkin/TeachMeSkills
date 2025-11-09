package myexamples.ExampleForTeacher;

public abstract class Cars {
    private String color;
    private String name;

    public Cars(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
