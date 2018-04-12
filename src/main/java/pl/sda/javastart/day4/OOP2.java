package pl.sda.javastart.day4;

public class OOP2 {

    public static void main(String[] args) {

        User firstUser = new User("Roman", "romekatomek12", "12345");
        User secondUser = new User("Roman", "romekatomek12", "12345");
        System.out.println(firstUser.equals(secondUser));
        System.out.println(firstUser.equals(""));
        System.out.println(firstUser==secondUser);
        System.out.println(firstUser.toString());
        System.out.println(firstUser);
        System.out.println(firstUser);

    }
}
