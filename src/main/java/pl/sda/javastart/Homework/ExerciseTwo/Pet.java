package pl.sda.javastart.Homework.ExerciseTwo;

import pl.sda.javastart.day3.Person;

public class Pet extends Animal implements OwnerHolder {

    Person owner;

    public Pet(String name, int weight, int age, Person owner) {
        super(name, weight, age);
        this.owner = owner;
    }

    public Pet(String name, int weight, int age) {
        super(name, weight, age);

    }

    public Person getOwner() {
        return owner;
    }

    @Override
    String introduceYourself() {
        return "Jestem zwierzakiem";
    }

    @Override
    public String getOwnerName() {
        return this.getOwner().getName();
    }
}
