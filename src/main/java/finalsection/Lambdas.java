package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Integer number = null;
        int couter = 0;

        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            int counter = 0;
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Alex", null));

    }

}
