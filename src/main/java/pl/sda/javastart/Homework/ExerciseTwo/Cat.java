package pl.sda.javastart.Homework.ExerciseTwo;

import pl.sda.javastart.day3.Person;

public class Cat extends Pet {

    public Cat(String name, int weight, int age, Person owner) {
        super(name, weight, age, owner);
    }

    public void drinkMilk(){

        System.out.println("pije mleko");
    }

    @Override
    String introduceYourself() {
        return "Jestem Kotem";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nOwner:" + owner +
                ' ';
    }
}

