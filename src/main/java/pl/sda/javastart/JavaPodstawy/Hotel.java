package pl.sda.javastart.JavaPodstawy;

public class Hotel {

    public static void main(String[] args) {

        Guests young = new Guests(908765, "Jakub", "Dobrogowski", 19);
        Guests middleage = new Guests(908432, "Kacper", "Pocheć", 43);
        Guests old = new Guests(908843, "Monika", "Rytych", 98);

        young.setSecondName("Dobrowolski");

        System.out.println(young);

    }

}
