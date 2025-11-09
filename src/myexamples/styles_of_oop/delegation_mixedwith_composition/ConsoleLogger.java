package myexamples.styles_of_oop.delegation_mixedwith_composition;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
