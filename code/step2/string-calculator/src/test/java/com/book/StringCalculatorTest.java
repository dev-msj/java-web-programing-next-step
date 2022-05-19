package com.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_또는_빈문자() {
        Assertions.assertEquals(0, cal.add(null));
        Assertions.assertEquals(0, cal.add(""));
    }

    @Test
    public void add_숫자하나() throws Exception {
        Assertions.assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_쉼표구분자() throws Exception {
        Assertions.assertEquals(3, cal.add("1,2"));
    }
}
