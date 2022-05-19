package com.book;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SplitTest {
    @Test
    public void split() {
        Assertions.assertArrayEquals(new String[] {"1"}, "1".split(","));
        Assertions.assertArrayEquals(new String[] {"1", "2"}, "1,2".split(","));
    }
}
