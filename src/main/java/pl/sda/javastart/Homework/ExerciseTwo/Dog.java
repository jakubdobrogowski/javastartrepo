package pl.sda.javastart.Homework.ExerciseTwo;

import pl.sda.javastart.day3.Person;

public class Dog extends Pet {


    public Dog(String name, int weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    public void biteBone(){

        System.out.println("gryzie kość");
    }

    @Override
    String introduceYourself() {
        return "Jestem Psem";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOwner: " + owner;
    }

}
