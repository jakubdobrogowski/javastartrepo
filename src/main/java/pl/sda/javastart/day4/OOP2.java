package pl.sda.javastart.day4;

public class OOP2 {

    public static void main(String[] args) {

        User userOne = new User("Andrzej", "Andrzej1910", "andzrej");
        User userTwo = new User("Roman", "romekatomek12", "12345");
        User userThree = new User("Roman", "romekatomek12", "12345");
        System.out.println(userTwo.equals(userThree));
        System.out.println(userTwo==userThree);


    }
}
