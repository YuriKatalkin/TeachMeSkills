package lesson10_homework;

public class AliveHuman {
    public String name;

    @Override
    public String toString() {
        return "AliveHuman , " +
                "name='" + name + '\'';
    }

    public AliveHuman(String name) {
        this.name = name;
    }
}
