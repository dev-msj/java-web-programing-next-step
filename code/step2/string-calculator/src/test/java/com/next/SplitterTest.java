package com.next;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SplitterTest {
    private static Splitter splitter;

    @BeforeAll
    public static void setup() {
        splitter = new Splitter();
    }

    @Test
    public void testDefaultSplit() {
        Assertions.assertThat(Arrays.equals(splitter.split("1,2"), new String[] {"1", "2"})).isTrue();
        Assertions.assertThat(Arrays.equals(splitter.split("1:2"), new String[] {"1", "2"})).isTrue();
        Assertions.assertThat(Arrays.equals(splitter.split("1,2:3"), new String[] {"1", "2", "3"})).isTrue();
    }

    @Test
    public void testCustomSplit() {
        Assertions.assertThat(Arrays.equals(splitter.customSplit("//a\n1a2"), new String[] {"1", "2"})).isTrue();
    }
}
