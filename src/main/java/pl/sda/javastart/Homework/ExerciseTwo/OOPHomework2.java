package pl.sda.javastart.Homework.ExerciseTwo;

import pl.sda.javastart.day3.Car;
import pl.sda.javastart.day3.Person;
import pl.sda.javastart.day4.Pensioner;
import pl.sda.javastart.day4.Student;
import pl.sda.javastart.day4.Worker;

public class OOPHomework2 {

    public static void main(String[] args) {

        interfaceOwnewr();
        // instanceofExamples();
        // arrayAnimal();
        // animals();
    }

    private static void interfaceOwnewr() {

        OwnerHolder car = new Car();
        System.out.println(car.getOwnerName());
        Person Jakub = new Student("Jakub", "Dobrogowski", 20, 243723, 1000, 600);

        OwnerHolder dog = new Dog("burek",3,7, Jakub);
        System.out.println(dog.getOwnerName());
    }
    private static void instanceofExamples() {
        Person Jakub = new Student("Jakub", "Dobrogowski", 20, 243723, 1000, 600);
        Person Monika = new Pensioner("Monika", "Rytych", 18, 8900);
        Person Kacper = new Worker("Kacper", "Pocheć", 19, 17000, "junior java developer");

        Animal reksio = new Dog("Reksio", 50, 7, Jakub);
        Animal mruczek = new Cat("Mruczek", 10, 2, Monika);
        Animal papug = new Bird("Papug", 1, 4, Kacper);
        Animal jan = new Human("Jan ", 87, 21);

        Animal[] arrayAnimal = new Animal[]{reksio, mruczek, papug, jan};

        for (Animal animal : arrayAnimal) {

            if (animal instanceof Dog) {
                ((Dog) animal).biteBone();
            }
            if (animal instanceof Cat) {
                ((Cat) animal).drinkMilk();
            }
            if (animal instanceof Bird) {
                ((Bird) animal).singWhenFlying();
            }
        }

    }

    private static void arrayAnimal() {
        Person Jakub = new Student("Jakub", "Dobrogowski", 20, 243723, 1000, 600);
        Person Monika = new Pensioner("Monika", "Rytych", 18, 8900);
        Person Kacper = new Worker("Kacper", "Pocheć", 19, 17000, "junior java developer");

        Animal reksio = new Dog("Reksio", 50, 7, Jakub);
        Animal mruczek = new Cat("Mruczek", 10, 2, Monika);
        Animal papug = new Bird("Papug", 1, 4, Kacper);
        Animal jan = new Human("Jan ", 87, 21);

        Animal[] arrayAnimal = new Animal[]{reksio, mruczek, papug, jan};

        for (Animal animal : arrayAnimal) {

            System.out.println(animal.introduceYourself());
        }
    }

    private static void animals() {
        Person Jakub = new Student("Jakub", "Dobrogowski", 20, 243723, 1000, 600);
        Person Monika = new Pensioner("Monika", "Rytych", 18, 8900);
        Person Kacper = new Worker("Kacper", "Pocheć", 19, 17000, "junior java developer");

        Dog reksio = new Dog("Reksio", 50, 7, Jakub);
        Cat mruczek = new Cat("Mruczek", 10, 2, Monika);
        Bird papug = new Bird("Papug", 1, 4, Kacper);

        Human jan = new Human("Jan ", 87, 21);

        System.out.println(jan);
        System.out.println(jan.introduceYourself());
        System.out.println();
        System.out.println(reksio);
        System.out.println(reksio.introduceYourself());
        System.out.println();
        System.out.println(mruczek);
        System.out.println(mruczek.introduceYourself());
        System.out.println();
        System.out.println(papug);
        System.out.println(papug.introduceYourself());
    }
}
