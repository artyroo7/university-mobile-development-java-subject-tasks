package com.example.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void Test01Result() {
        String number11 = "A";
        String number22 = "B";
        String sign11 = "+";

        double expectedValue = 0;
        double actualValue = TextCounter.result(number11, number22, sign11);

        assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void Test02Result() {
        String number11 = "1A";
        String number22 = "1B";
        String sign11 = "+";

        double expectedValue = 0;
        double actualValue = TextCounter.result(number11, number22, sign11);

        assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void Test03Result() {
        String number11 = "2";
        String number22 = "2";
        String sign11 = ":";

        double expectedValue = 0;
        double actualValue = TextCounter.result(number11, number22, sign11);

        assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void Test04Result() {
        String number11 = "9999999999";
        String number22 = "1111111111";
        String sign11 = "+";

        double expectedValue = 0;
        double actualValue = TextCounter.result(number11, number22, sign11);

        assertEquals(expectedValue, actualValue, 0.0);
    }

    @Test
    public void Test05Result() {
        String number11 = "1/2";
        String number22 = "1:2";
        String sign11 = ";";

        double expectedValue = 0;
        double actualValue = TextCounter.result(number11, number22, sign11);

        assertEquals(expectedValue, actualValue, 0.0);
    }
}