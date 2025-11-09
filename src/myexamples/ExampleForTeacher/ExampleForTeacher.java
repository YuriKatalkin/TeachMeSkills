package myexamples.ExampleForTeacher;

public class ExampleForTeacher {
    public static void main(String[] args) {
        Animal lion = new Lion("lion", "alex", 2020);
        //(Первый случай)
       // System.out.println(lion.toString().toUpperCase());
        //(Второй случай)
        System.out.println(lion);
        lion.makeNoise();
        System.out.println(lion.nameExample(lion.toString()));
        useInstanceOf();

    }
    public static void useInstanceOf() {
        Animal lion = new Lion("lion", "alex", 2020);
        System.out.println("Lion instance of Animal" + " = " + (lion instanceof Animal));
    }
}
