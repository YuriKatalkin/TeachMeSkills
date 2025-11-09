package myexamples.styles_of_oop.delegation_mixedwith_composition;

public class CarWithDelegation {
    private Engine engine;
    private Logger logger;
    public CarWithDelegation(Logger logger) {
        this.engine = new Engine();
        this.logger = logger;
    }

    public void startCar() {
        engine.start();
        logger.log("Car started");
    }

    public void stopCar() {
        engine.stop();
        logger.log("Car stopped");
    }
}
