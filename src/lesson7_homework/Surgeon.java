package lesson7_homework;

public class Surgeon extends Hospital {

    @Override
    public void healing() {
        System.out.println("\"Хирург\"" + " - лечит хирургическим путём");
    }
}
