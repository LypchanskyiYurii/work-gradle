package ua.com.yurii.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticsTest {

    @Test
    void testSumUpTo() {
        Arithmetics arithmetics = new Arithmetics();

        assertEquals(15, arithmetics.sumUpTo(5));
    }

}
