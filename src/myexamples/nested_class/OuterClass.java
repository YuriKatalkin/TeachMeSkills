package myexamples.nested_class;

public class OuterClass {
    private String outerField = "Внешнее поле";

    // Внутренний класс
    class InnerClass {
        public void showOuterField() {
            System.out.println("Доступ к: " + outerField);
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.showOuterField();
    }
}

