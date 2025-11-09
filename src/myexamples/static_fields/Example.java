package myexamples.static_fields;

public class Example {
    int age;
    static int retirementAge = 67;
    static{
        retirementAge = 65;
        System.out.println("Static initializer");
    }
}
