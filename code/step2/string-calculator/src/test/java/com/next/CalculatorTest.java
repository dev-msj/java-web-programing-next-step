package com.next;

import com.next.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    public static void setup() {
        calculator = new Calculator();
    }

    @Test
    public void test() {

    }
}
