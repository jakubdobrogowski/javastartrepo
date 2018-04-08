package pl.sda.javastart.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    @Test
    public void testRectangleArea() {

        assert Methods.rectangle(5, 7) == 36;

    }
    @Test
    public void testRectangleArea1() {
        assert Methods.rectangle(5, 7) == 35;
        assert Methods.rectangle(1, 1) == 1;
    }
}

