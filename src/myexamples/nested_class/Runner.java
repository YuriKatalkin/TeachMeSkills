package myexamples.nested_class;

public class Runner {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner();  // Выведет: Доступ к: Внешнее поле

    }
}
