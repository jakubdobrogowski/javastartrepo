package pl.sda.javastart.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldNotShowPasswodInToStringMetod() {

        User userTwo = new User("Roman", "romekatomek12", "12345");
        String userTwoText = userTwo.toString(); //wazne
        assert !(userTwoText.contains("12345"));
    }
}