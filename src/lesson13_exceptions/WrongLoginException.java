package lesson13_exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super();
    }
}
