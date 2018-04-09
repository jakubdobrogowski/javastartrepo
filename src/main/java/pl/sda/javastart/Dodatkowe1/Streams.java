package pl.sda.javastart.Dodatkowe1;

import org.junit.jupiter.api.Test;
import pl.sda.javastart.day3.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    private List<Person> people = Arrays.asList(
            new Person(1, "Anna", "Nowak", 33),
            new Person(2, "Beata", "Kowalska", 22),
            new Person(3, "Marek", "Nowak", 25),
            new Person(4, "Adam", "Twardowski", 33),
            new Person(5, "Monika", "Kos", 25),
            new Person(6, "Adam", "Rudy", 45),
            new Person(7, "Marek", "Rudy", 15)
    );

    @Test
    public void filtering() {

        String commas = people.stream()
                .filter(x -> x.getName().length() == 4)
                .map(e -> e.getName())
                .collect(Collectors.joining(", "));
        System.out.println(commas);

        String commasDistinc = people.stream()
                .filter(x -> x.getName().length() == 4)
                .map(e -> e.getName())
                .distinct()
                .collect(Collectors.joining(", "));
        System.out.println(commasDistinc);

    }

    @Test
    public void sorting() {

        List<Person> list = people.stream()
       //         .sorted((a, b) -> a.getAge().comperTo(b.getAge()))
                .collect(Collectors.toList());
        System.out.println(list);
    }
    
    @Test
    public void collectorss() {
        
        people.stream().collect(
                Collectors.groupingBy(
                        
                        e-> e.getName(),
                        Collectors.counting()
                )
        );
    }
}
