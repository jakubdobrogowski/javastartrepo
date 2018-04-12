package pl.sda.javastart.Homework.ExerciseTwo;

public class Human extends Mammal {

    public Human(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    String introduceYourself() {
        return "Mama na imie " + this.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
