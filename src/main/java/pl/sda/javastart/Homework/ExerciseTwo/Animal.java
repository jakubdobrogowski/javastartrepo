package pl.sda.javastart.Homework.ExerciseTwo;

public abstract class Animal {

    private String name;
    private int weight;
    private int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    abstract String introduceYourself();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                "name: " + name  +
                ", weight: " + weight +
                ", age: " + age;
    }
}
