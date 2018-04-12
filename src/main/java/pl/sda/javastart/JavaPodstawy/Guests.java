package pl.sda.javastart.JavaPodstawy;

public class Guests {

    private int roomReservation;
    private String firstName;
    private String secondName;
    private int age;

    public Guests(int roomReservation, String firstName, String secondName, int age) {
        this.roomReservation = roomReservation;
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public int getRoomReservation() {
        return roomReservation;
    }

    public void setRoomReservation(int roomReservation) {
        this.roomReservation = roomReservation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Guests{" +
                "roomReservation=" + roomReservation +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
