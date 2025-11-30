package SpecialTask;

import java.io.Serializable;
import java.util.Arrays;

public class Terminal implements Serializable {
    public String[] parameters;

    @Override
    public String toString() {
        return "Terminal{" +
                "parameters=" + Arrays.toString(parameters) +
                '}';
    }

    public Terminal(String[] parameters) {
        this.parameters = parameters;
    }
}
