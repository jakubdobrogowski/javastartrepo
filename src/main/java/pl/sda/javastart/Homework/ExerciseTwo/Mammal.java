package pl.sda.javastart.Homework.ExerciseTwo;

public abstract class Mammal extends Animal {

    public Mammal(String name, int weight, int age) {
        super(name, weight, age);
    }

    @Override
    String introduceYourself() {
        return "Jestem ssakiem";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
