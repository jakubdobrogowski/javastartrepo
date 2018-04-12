package pl.sda.javastart.Homework.ExerciseTwo;

import pl.sda.javastart.day3.Person;

public class Bird extends Pet {


    public Bird(String name, int weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    public void singWhenFlying() {

        System.out.println("Spiewa podczas latania");
    }

    @Override
    String introduceYourself() {
        return "Jestem Ptakiem";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOwner: " + owner +
                ' ';
    }
}
