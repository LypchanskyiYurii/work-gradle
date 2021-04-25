package ua.com.yurii.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sum() {
        Numbers numbers = new Numbers();
        assertEquals(15, numbers.sum(5));
    }
}