package pl.sda.javastart.Dodatkowe1;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class lambdas {

    private List<String> animals = Arrays.asList("cat", "dog", "mouse", "rat", "pig", "rabbit");

    @Test
    public void Lambdas() {

        for (String animal : animals) {

            System.out.println(animal);
        }

        animals.forEach(e -> System.out.println(e + ", "));
        System.out.println();
        animals.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e + " "));
        System.out.println();
        System.out.println(animals.stream().collect(Collectors.joining(", ")));

        animals.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println();

        animals.sort((a, b) -> a.compareTo(b));
        animals.sort(String::compareTo);
        animals.sort(Comparator.naturalOrder());


    }


    public interface OurChecker {

        boolean check(Integer value);
    }

    private OurChecker isDivisibleBy3 = new OurChecker() {
        @Override
        public boolean check(Integer value) {
            return value % 3 == 0;
        }
    };

    private OurChecker getIsDivisibleBy3withLambda = val -> val % 3 == 0;


    @Test

    public void checking() {

        System.out.println(isDivisibleBy3.check(122));
        System.out.println(isDivisibleBy3.check(3));

        System.out.println(getIsDivisibleBy3withLambda.check(122));
        System.out.println(getIsDivisibleBy3withLambda.check(3));
    }
}
