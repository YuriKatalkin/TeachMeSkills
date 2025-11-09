package myexamples.styles_of_oop.delegation_mixedwith_composition;

public class DelegationRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.stopCar();

        Logger logger = new ConsoleLogger();
        CarWithDelegation carWithLog = new CarWithDelegation(logger);
        carWithLog.startCar();
        carWithLog.stopCar();
    }
}
