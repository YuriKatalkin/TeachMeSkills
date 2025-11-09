package myexamples.ExampleForTeacher;

public class Animal {
    private String type;
    private String name;
    private int born;

    public Animal(String type, String name, int born) {
        this.type = type;
        this.name = name;
        this.born = born;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", born=" + born +
                '}';
    }

    public void makeNoise(){
        System.out.println();
    }

    public String nameExample (String name){
        return "Имя - " + this.name;
    }
}
