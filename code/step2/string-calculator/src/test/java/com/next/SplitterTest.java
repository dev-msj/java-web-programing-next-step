package com.next;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

public class SplitterTest {
    @ParameterizedTest
    @ValueSource(strings = {"1,2,3", "1:2:3", "1,2:3"})
    public void testDefaultSplit(final String input) {
        Assertions.assertThat(
                Arrays.equals(new Splitter(input).split(), new String[] {"1", "2", "3"})
        ).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"//a\n1a2a4", "//\n124", "//;;\n1;;2;;4"})
    public void testCustomSplit(final String input) {
        Assertions.assertThat(
                Arrays.equals(new Splitter(input).split(), new String[] {"1", "2", "4"})
        ).isTrue();
    }
}
